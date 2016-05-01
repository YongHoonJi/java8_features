package com.java8.features.examples;

import org.junit.Test;

public class LambdaExp {

	@Test
	public void testWithLambda(){
		new Thread(new Runnable() {
		    @Override
		    public void run(){
		        System.out.println("Task #1 is running");
		    }
		}).start();
		
		// Lambda Runnable - FunctionalInterface
		Runnable task2 = () -> { System.out.println("Task #2 is running"); };
		// start the thread
		new Thread(task2).start();
	}
	 
}
