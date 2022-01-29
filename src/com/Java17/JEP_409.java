package com.Java17;

public class JEP_409 {

	
	
	// JEP 409: Sealed Classes

	//Imp- ********* A sealed class or interface can be extended or implemented only by those classes and interfaces permitted to do so.
	
	
	sealed interface Celestial 
    permits Planet, Star, Comet {  }   // Test is not in permitted type

	final class Planet implements Celestial {  }
	final class Star   implements Celestial {  }
	final class Comet  implements Celestial {  }
	final class Test  implements Celestial {  }  // Giving error because it is not in permitted type

	
}
