package com.java8.features.functions.examples;

import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;

public class PredicateExample {

	@Test
	public void test_test() {
		Predicate<String> predicate = (s) -> s.length() > 5;
		Assert.assertEquals(true, predicate.test("test in predicate"));
	}

	@Test
	public void test_and_or() {
		Predicate<String> mainFunc = (s) -> s.length() > 5;
		Predicate<String> andFunc = (s) -> s.contains("and");
		
		Assert.assertEquals(false, mainFunc.and(andFunc).test("test in predicate"));
		Assert.assertEquals(true, mainFunc.or(andFunc).test("test in predicate"));
	}
	
	@Test
	public void test_isEqual(){
		Predicate<Integer> i  = Predicate.isEqual(10);
		Assert.assertEquals(true, i.test(10));
	}
	
	@Test 
	public void test_negate(){
		 Predicate<String> mainFunc  = (s)-> s.length() > 5;
		 Assert.assertEquals(false, mainFunc.negate().test("test negate"));
	}

}
