package com.java8.features.examples;

import org.junit.Test;

public class DefaultMethod {
	
	@Test
	public void test_defaultMethod() {
		RealizedClass r = new RealizedClass();
		r.defMethod();
		r.run();
	}
	
	
	interface interfaceWitDefaultMethod{
		default void defMethod(){
			System.out.println("default method");
		}
		
		// This feature helps us in avoiding undesired results in case of poor implementation in child classes. 
		static void staticMethod(){
			System.out.println("static method");
		}
		
		public void run();
	}
	
	class RealizedClass implements interfaceWitDefaultMethod{
		
		@Override
		public void defMethod(){
			System.out.println("overridden def ");
		}
		
		@Override
		public void run() {
			System.out.println("realized method");
		}
	}
}
