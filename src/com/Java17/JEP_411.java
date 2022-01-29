package com.Java17;

public class JEP_411 {

	
	//JEP 411: Deprecate the Security Manager for Removal
	
	//Java 1.0 introduced the Security Manager to secure the client-side Java code, and irrelevant now.

	//This JEP deprecates the Security Manager for removal.
	
	
	@Deprecated(since="17", forRemoval=true)   // deprecated here
	public class SecurityManager {
	  //...
	}
	
}
