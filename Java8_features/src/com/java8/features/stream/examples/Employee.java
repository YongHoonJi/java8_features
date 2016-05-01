package com.java8.features.stream.examples;

import com.google.common.base.MoreObjects;

public class Employee {
		
		private String name;
		private Integer age;
		private Long sal;
		
		public Employee(String name, Integer age, Long sal){
			this.name = name;
			this.age = age;
			this.sal = sal;
		}
		
		public String getName() {
			return name;
		}
		public Integer getAge() {
			return age;
		}
		public Long getPay() {
			return sal;
		}
		
		@Override
		public String toString(){
			return MoreObjects.toStringHelper(Employee.class)
			.add("name", this.name)
			.add("age", this.age)
			.add("sal", this.sal)
			.toString();
		}

}
