package com.Java17;

import java.awt.Panel;

public class JEP_398 {

	//The Java Applet API is irrelevant because most of the web-browser has removed support for Java browser plug-ins.

	//Java 17  mark the Applet API for removal.
	
	
	@Deprecated(since = "9", forRemoval = true)
	@SuppressWarnings("removal")  // removal java 17
	class Applet extends Panel {
	  //...
	}
	

	
}
