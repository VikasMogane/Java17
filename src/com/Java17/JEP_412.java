package com.Java17;

public class JEP_412 {

//  JEP 412: Foreign Function & Memory API (Incubator)
	
	//The Foreign Function and Memory API allow Java developers to access code from outside the JVM and manage memory out of the heap
	// The goal is to replace the JNI API and improve the security and performance compared to the old one. 
	
	
	
	//we can make a call to a C library from a Java class:
	
	private static final SymbolLookup libLookup;

	static {
	    // loads a particular C library
	    var path = JEP412.class.getResource("/print_name.so").getPath();
	    System.load(path);
	    libLookup = SymbolLookup.loaderLookup();
	}
	
	
	//First, it is necessary to load the target library we wish to invoke via the API (as shown above).
	//Next, we need to specify the signature of the target method and finally call it:
	
	public String getPrintNameFormat(String name) {

	    var printMethod = libLookup.lookup("printName");

	    if (printMethod.isPresent()) {
	        var methodReference = CLinker.getInstance()
	            .downcallHandle(
	                printMethod.get(),
	                MethodType.methodType(MemoryAddress.class, MemoryAddress.class),
	                FunctionDescriptor.of(CLinker.C_POINTER, CLinker.C_POINTER)
	            );

	        try {
	            var nativeString = CLinker.toCString(name, newImplicitScope());
	            var invokeReturn = methodReference.invoke(nativeString.address());
	            var memoryAddress = (MemoryAddress) invokeReturn;
	            return CLinker.toJavaString(memoryAddress);
	        } catch (Throwable throwable) {
	            throw new RuntimeException(throwable);
	        }
	    }
	    throw new RuntimeException("printName function not found.");
	}


	
	
}
