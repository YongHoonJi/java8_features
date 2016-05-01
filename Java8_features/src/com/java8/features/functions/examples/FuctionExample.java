package com.java8.features.functions.examples;

import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;

public class FuctionExample {

	// R apply(T t)
	@Test
	public void test_function_apply() {
		Function<Integer, String> converter = (i) -> Integer.toString(i);

		Assert.assertEquals(1, converter.apply(3).length());
		Assert.assertEquals(2, converter.apply(30).length());

		Assert.assertEquals("100", calc((a) -> Integer.toString(a * a), 10));
		Assert.assertEquals("5000", calc((a) -> Integer.toString(a * a / 2), 100));
	}

	private String calc(Function<Integer, String> bi, Integer i) {
		return bi.apply(i);
	}
	
	// default <V> Function<V,R> compose(Function<? super V,? extends T> before)
	@Test
	public void test_function_compose(){
		// before function : strToIntFunc
		Function<String, Integer> strToIntFunc = (s)-> Integer.parseInt(s);
	    Function<Integer, Integer> toSquareFunc = (s)-> s*s;
	    
	    Assert.assertEquals(new Integer(9), toSquareFunc.apply(3));
	    Assert.assertEquals(new Integer(9), toSquareFunc.compose(strToIntFunc).apply("3"));
	}
	
	// default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
	@Test
	public void test_function_andThen(){
		// after function : toSquareFunc
		Function<String, Integer> strToIntFunc = (s)-> Integer.parseInt(s);
	    Function<Integer, Integer> toSquareFunc = (s)-> s*s;
	    
	    Assert.assertEquals(new Integer(9), toSquareFunc.apply(3));
	    Assert.assertEquals(new Integer(9), strToIntFunc.andThen(toSquareFunc).apply("3"));		
	}
	
	
	// static <T> Function<T,T> identity()
	@Test
	public void test_function_identity(){
		Function<Integer,Integer> identityFunc = Function.identity();
		Assert.assertEquals(new Integer(3), identityFunc.apply(3));
	}
}
