package com.Java17;



//JEP 406: Pattern Matching for switch (Preview)    

public class JEP_406 {

	record Point(int i, int j) {}
	enum Days { SUNDAY, MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY; }

	static void typeTester(Object o) {
	    switch (o) {
	        case null     -> System.out.println("null"); // null handle here directly
	        case String s -> System.out.println("String");
	        case Days c  -> System.out.println("Days with " + Days.values().length + " values");
	        default       -> System.out.println("Something else");
	    }
	}
	public static void main(String[] args) {
		
		
		//------------Before java 17-------------------------
		
		String s =null;
		if(s==null)
		{
			System.out.println("Contains null value");
			return;   // Statement ends here only 
		}
		
		else switch(s) //need to check everytime null before entering into switch
		{
			case "A","B" -> System.out.println("AB");
			default 	 -> System.out.println("Default");
		}  
		
		//------------In  java 17-------------------------

		typeTester(null);  // We dont have to handle null case explicitly
		typeTester(Days.SUNDAY);
	}
}
