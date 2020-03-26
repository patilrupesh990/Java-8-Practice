package com.bridgelabz.java8.mapreduce;

import java.util.ArrayList;
import java.util.List;

public class MapReduceLabdaExpression {

	private static double average(List<? extends Employee> peoples) {
		return peoples.stream().mapToInt(p -> p.getAge()).average().getAsDouble();
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Rupesh", 20));
		employees.add(new Employee(2, "Hardik", 24));
		employees.add(new Employee(3, "Paresh", 21));
		employees.add(new Employee(4, "kavery", 23));
		employees.add(new Employee(5, "Gurang", 28));
		employees.add(new Employee(6, "Sudam", 66));
		employees.add(new Employee(7, "Ritesh", 54));
		employees.add(new Employee(8, "Durga", 12));

		System.out.println("Avarage Age Of Employee is:" + average(employees));
	}
}
