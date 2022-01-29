package com.Java17;

//JEP 306: Restore Always-Strict Floating-Point Semantics

public class JEP_306 {

//	- Before Java 1.2, all floating-point calculations were strict; and it caused overheats on x87-based hardware.
//  - Since Java 1.2, we need the keyword strictfp to enable the strict floating-point calculation. The default floating-point calculation was changed from strict to subtly different floating-point calculations (avoid overheats issues).
//  - Now, since Intel and AMD have both support SSE2 (Streaming SIMD Extensions 2) extensions, which could support for the strict JVM floating-point operations without the overheats, so, the previous (before Java 1.2) overheats issues on x87-based hardware are irreverent in nowaday hardware.
//  - Java 17 restores the pre-Java 1.2 strict floating-point calculations as default, which means the keyword strictfp is now optional.

	//------------StrictMath.java Before java 17-------------------------


	private static final double DEGREES_TO_RADIANS = 3.14;
	private static final double PI = 3.14;
	
	public static strictfp double toRadians(double angdeg) {
	    // Do not delegate to Math.toRadians(angdeg) because
	    // this method has the strictfp modifier.
	    return angdeg * DEGREES_TO_RADIANS;
	}
	
	
	
	//------------StrictMath.java changes In  java 17-------------------------

	public static double toRadianss(double angdeg) {
	    return Math.toRadians(angdeg);
	}
	
	public static strictfp double toRadiansss(double angdeg) {
	    // Do not delegate to Math.toRadians(angdeg) because
	    // this method has the strictfp modifier.
	    return angdeg / 180.0 * PI;
	}
}
