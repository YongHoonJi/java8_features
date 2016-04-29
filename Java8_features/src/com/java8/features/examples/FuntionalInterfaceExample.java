package com.java8.features.examples;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class FuntionalInterfaceExample {

	@Test
	public void test_functionalInterface(){
		Processor proc = (x) -> (x*x);
		List<Integer> numbers = Lists.newArrayList(1,2,3,4,5);
		
		numbers.stream().map(n -> proc.doProcess(n)).forEach(n -> System.out.println(n));
	}
	
	
	@FunctionalInterface
	interface Processor{
		int doProcess(int x);
	}
}
