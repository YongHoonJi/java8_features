package com.java8.features.predate;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		// creating tree map
		NavigableMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// populating tree map

		System.out.println("Checking first entry");
		System.out.println("First entry is: " + treemap.firstEntry());


		// populating tree map
		treemap.put(2, "two");
		treemap.put(1, "one");
		treemap.put(3, "three");
		treemap.put(6, "six");
		treemap.put(5, "five");

		System.out.println("Ceiling key entry for 4: " + treemap.ceilingKey(4));
		System.out.println("Ceiling key entry for 5: " + treemap.ceilingKey(5));
		System.out.println("Ceiling key entry for 7: " + treemap.ceilingKey(7));
	}
}