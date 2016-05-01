package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntermediateOperation {
	private List<Employee> employees = new ArrayList<Employee>();
	@Before
	public void loadEmployees(){
		employees.add(new Employee("Mark", new Integer(34), new Long(80000)));
		employees.add(new Employee("Jully", new Integer(40), new Long(50000)));
		employees.add(new Employee("Justin", new Integer(28), new Long(70000)));
		employees.add(new Employee("Michael", new Integer(20), new Long(300000)));
		employees.add(new Employee("Jack", new Integer(40), new Long(50000)));
		employees.add(new Employee("Nola", new Integer(20), new Long(70000)));
		employees.add(new Employee("Richard", new Integer(20), new Long(70000)));
		employees.add(new Employee("Raul", new Integer(20), new Long(40000)));
		employees.add(new Employee("Jamie", new Integer(30), new Long(80000)));
		employees.add(new Employee("Bob", new Integer(30), new Long(700000)));
	}
	
	@Test
	public void test_mapping(){
		employees.stream().map(e -> e.getName()).forEach(s -> System.out.println(s));
		System.out.println("print all names");
		
		Long countOfA = employees.stream().map(e -> e.getName().split("")).flatMap(Arrays::stream)
		.collect(Collectors.toList()).stream().filter(a -> a.equals("a")).count();
		System.out.println("count of 'a' = "+countOfA);
		Assert.assertEquals(new Long(7), countOfA);
	}
	
	@Test
	public void test_skip_limit(){
		Assert.assertEquals(6, employees.stream().skip(4).collect(Collectors.toList()).size());
		Assert.assertEquals(4, employees.stream().limit(4).collect(Collectors.toList()).size());
	}
}
