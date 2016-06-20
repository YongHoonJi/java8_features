package com.java8.features.predate;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		// see hello_en_US.properties
		// create a new ResourceBundle with specified locale
		ResourceBundle bundle = ResourceBundle.getBundle("hello", Locale.US);

		// print the text assigned to key "hello"
		System.out.println("" + bundle.getString("hello"));

	}
}