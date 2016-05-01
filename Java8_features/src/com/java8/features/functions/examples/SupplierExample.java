package com.java8.features.functions.examples;

import java.util.function.Supplier;

import org.junit.Assert;
import org.junit.Test;

public class SupplierExample {
	
	@Test
	public void test_get() {
		Supplier<String> supplier = () -> "supplier";
		Assert.assertEquals("supplier", supplier.get());
	}
}
