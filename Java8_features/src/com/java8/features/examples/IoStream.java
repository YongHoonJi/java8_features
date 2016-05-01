package com.java8.features.examples;

import java.io.File;
import java.nio.file.Files;

import org.junit.Test;

public class IoStream {
	
	@Test
	public void test_fileList(){
		try {
			System.out.println("FILE LIST");
			String dir = "/Users/Justin/Documents/work/sts";
			Files.list(new File(dir).toPath())
		     .filter(p -> !p.getFileName().toString().startsWith("."))
		     .limit(3)
		     .forEach(System.out::println);
			
			System.out.println("FILE WALK");
			Files.walk(new File(dir).toPath())
		     .filter(p -> !p.getFileName().toString().startsWith("."))
		     .forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
