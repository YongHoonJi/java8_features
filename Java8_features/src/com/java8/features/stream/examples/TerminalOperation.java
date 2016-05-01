package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TerminalOperation {
	private List<Employee> employees = new ArrayList<Employee>();

	@Before
	public void loadEmployees() {
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
	public void test_find_match_sort() {

		Assert.assertEquals(true, employees.stream().anyMatch(e -> e.getAge() > 30));
		Assert.assertEquals(false, employees.stream().allMatch(e -> e.getAge() > 40));

		Employee emp = employees.stream().filter(e -> e.getAge() == 40).findAny()
				.orElse(new Employee("unknown", new Integer(0), new Long(0)));
		System.out.println("find Any :" + emp.toString());

		employees.stream().filter(e -> e.getAge() >= 30).sorted(Comparator.comparing(Employee::getAge).reversed())
				.collect(Collectors.toList()).stream().forEach(e -> System.out.println(e.toString()));

		Optional<Employee> optionalEmp = employees.stream().filter(e -> e.getAge() >= 30)
				.sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst();
		System.out.println("find any : " + optionalEmp.get());
	}

	@Test
	public void test_min_max_reduce() {
		Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println("max - " + max.get().toString());

		Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getAge));
		System.out.println("min - " + min.get().toString());

		System.out.println("sum age : " + employees.stream().map(e -> e.getAge()).reduce(0, (e1, e2) -> e1 + e2));
	}

	@Test
	public void test_collect_summary_group() {
		
		// groupby
		Map<Long, List<Employee>> byPay = employees.stream().collect(Collectors.groupingBy(Employee::getPay));

		for (Long l : byPay.keySet()) {
			System.out.println("salary:" + l);
			byPay.get(l).stream().forEach(e -> System.out.println(e.toString()));
		}

		// Partitioning
		Map<Boolean, List<Employee>> passingFailing = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() >= 40));
		System.out.println("partitioninig - true");
		passingFailing.get(true).stream().forEach(e -> System.out.println(e.toString()));
		System.out.println("partitioninig - fasle");
		passingFailing.get(false).stream().forEach(e -> System.out.println(e.toString()));
		
		
		// summary
		IntSummaryStatistics stats = employees.stream()
				.collect(Collectors.summarizingInt(Employee::getAge));
		System.out.println(stats.toString());
	}

}
