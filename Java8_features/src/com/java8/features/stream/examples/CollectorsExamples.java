package com.java8.features.stream.examples;

import java.util.Collections;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CollectorsExamples {
	@Test
	public void test_collectors(){
		Stream<Locale> localeStream = Stream.of(Locale.getAvailableLocales());
		System.out.println(Locale.KOREA.getLanguage()+","+Locale.KOREA.toString());
		System.out.println(localeStream.map(l -> l.getCountry()).collect(Collectors.joining("|", "<", ">")));
	}
	
	@Test
	public void test_patternCompile(){
		String text = "Unless required by applicable law or agreed to in writing";
		Stream<String> compiled = Pattern.compile("\\s").splitAsStream(text);
		compiled.forEach(s -> System.out.println(s));
	}
}
