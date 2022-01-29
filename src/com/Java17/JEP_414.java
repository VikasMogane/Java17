package com.Java17;

public class JEP_414 {
	
//  JEP 414: Vector API (Second Incubator)
	//The Vector API deals with the SIMD (single instruction multiple data) type of operation, meaning various sets of instructions 
	//executed in parallel. It leverages specialized CPU hardware that supports vector instructions and allows the execution of such 
	//instructions as pipelines. As a result, the new API will enable developers to implement more efficient code, leveraging the potential
	//of the underlying hardware.

	//Everyday use cases for this operation are scientific algebra linear applications, image processing, character processing, and 
	//any heavy arithmetic application or any application that needs to apply an operation for multiple independent operands.

	//Let's use the API to illustrate a simple vector multiplication example:
	
	
	public void newVectorComputation(float[] a, float[] b, float[] c) {
	    for (var i = 0; i < a.length; i += SPECIES.length()) {
	        var m = SPECIES.indexInRange(i, a.length);
	        var va = FloatVector.fromArray(SPECIES, a, i, m);
	        var vb = FloatVector.fromArray(SPECIES, b, i, m);
	        var vc = va.mul(vb);
	        vc.intoArray(c, i, m);
	    }
	}

	public void commonVectorComputation(float[] a, float[] b, float[] c) {
	    for (var i = 0; i < a.length; i ++) {
	        c[i] = a[i] * b[i];
	    }
	}

}
