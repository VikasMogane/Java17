package com.Java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class JEP_356 {

	public static void main(String[] args) {
		
		//------------ Before java 17-------------------------
		//The below example uses the new Java 17 RandomGeneratorFactory to get the
		//famous Xoshiro256PlusPlus PRNG algorithms to generate random integers
		//within a specific range, 0 – 20.


		RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(100);
		System.out.println(randomGenerator.getClass());
		
		int counter =0;
		while(counter<=10)
		{
			int randomGen = randomGenerator.nextInt(20);
			System.out.println(randomGen);
			counter++;
		}
		
	//------------changes In  java 17-------------------------

	//	This JEP introduced a new interface called RandomGenerator to make future
	//	pseudorandom number generator (PRNG) algorithms easier to implement or use.
		RandomGeneratorFactory.all().map(
		fac -> fac.group()+" : "+fac.name())
		.sorted().forEach(System.out::println
		);
		
	
	}
}
