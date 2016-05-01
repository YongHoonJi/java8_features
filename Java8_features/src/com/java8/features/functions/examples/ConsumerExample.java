package com.java8.features.functions.examples;

import java.util.function.Consumer;

import org.junit.Test;

public class ConsumerExample {
	@Test
	public void test_accept() {
		Consumer<String> myConsumer = (y) -> {
			 System.out.println(y +" consumed.");
		};

		myConsumer.accept("Element");
	}
}
