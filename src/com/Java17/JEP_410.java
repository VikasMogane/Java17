package com.Java17;

public class JEP_410 {

	//JEP 410: Remove the Experimental AOT and JIT Compiler
	
	//However, this feature has little use since they were introduced and required significant effort to maintain it, so this JEP removed the experimental Java-based ahead-of-time (AOT) and just-in-time (JIT) compiler

	//The following AOT packages, classes, tools and codes are removed:

	//jdk.aot — the jaotc tool
	//jdk.internal.vm.compiler — the Graal compiler
	//jdk.internal.vm.compiler.management — Graal’s MBean
	//src/hotspot/share/aot — dumps and loads AOT code
	//Additional code guarded by #if INCLUDE_AOT
}
