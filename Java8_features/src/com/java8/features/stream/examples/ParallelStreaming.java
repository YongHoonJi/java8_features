package com.java8.features.stream.examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ParallelStreaming {
	
	@Test
	public void test_paralle(){
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.parallelStream().forEach(i -> System.err.println(i*100));
	}
}
