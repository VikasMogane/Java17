package com.Java17;

public class JEP_403 {

	// JEP 403: Strongly Encapsulate JDK Internals

	//Many third-party libraries, frameworks, and tools are accessing the internal APIs and packages of the JDK. The Java 16, JEP 396 
	//make the strong encapsulation by default (we are not allowed to access the internal APIs easily). However,
	//we can still use --illegal-access to switch to the simple encapsulation to still access the internal APIs.
	//This JEP is the successor to the above Java 16 JEP 396, and it takes one more step by removing 
	//the --illegal-access option, which means we have no ways to access the internal APIs, except
	//for critical internal APIs such as sun.misc.Unsafe.

	//Try the --illegal-access=warn in Java 17.

	//	Terminal

	//java --illegal-access=warn

	//OpenJDK 64-Bit Server VM warning: Ignoring option --illegal-access=warn; support was removed in 17.0  
	
	
	
}
