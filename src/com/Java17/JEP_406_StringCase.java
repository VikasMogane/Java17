package com.Java17;

public class JEP_406_StringCase {

	public static void main(String[] args) {
		
		
		//String s =null;
		/*if(s==null)
		{
			System.out.println("Contains null value");
			return;   // Statement ends here only 
		}
		
		else switch(s) //need to check everytime null before entering into switch
		{
			case "A","B" -> System.out.println("AB");
			default 	 -> System.out.println("Default");
		}  */
		
	
		// In Java 17
		//testFooBar(null);
		
		/*switch(s) //need to check everytime null before entering into switch
		{
			case "A","B" -> System.out.println("AB");
			case null  ->	System.out.println("Null");
			default 	 -> System.out.println("Default");
		}*/
		
		
		 testString("Java 16");  // Ok
	      testString("Java 11");  // LTS
	      testString("");         // Ok
	      testString(null);       // Unknown!
	}
	
	 static void testString(String s) {
	        switch (s) {
	            case null                   -> System.out.println("Unknown!");
	            case "Java 11", "Java 17"   -> System.out.println("LTS");
	            default                     -> System.out.println("Ok");
	        }
	    }
	static void testFooBar(String s) {
	    switch (s) {
	        case null         -> System.out.println("Oops");
	        case "Foo", "Bar" -> System.out.println("Great");
	        default           -> System.out.println("Ok");
	    }
	}
}
