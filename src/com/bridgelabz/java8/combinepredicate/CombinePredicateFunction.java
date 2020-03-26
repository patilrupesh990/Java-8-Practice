package com.bridgelabz.java8.combinepredicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombinePredicateFunction {
	public static void main(String[] args) {
		List<Person> list=Stream.of(
				new Person("Rupesh","India","Surat",23),
				new Person("Rahul", "India", "Hydrabad", 20),
				new Person("Farukh", "Dubai", "Abudhabi", 33),
				new Person("Kunnal", "India", "Surat", 25),
				new Person("John", "Us", "Houston", 41),
				new Person("Chung chang cho", "China", "beaging", 20),
				new Person("kevin", "Us", "Chicago", 25),
				new Person("David", "Canada", "Toronto", 21),
				new Person("Garg", "Dubai", "Abudhabi", 22)
				).collect(Collectors.toList());
		
		Predicate<Person> usPerson=p-> p.getCountry().equals("Us");
		Predicate<Person> suratPerson=p->p.getCountry().equals("India");
		System.out.println("Peoples From Us");
		System.out.println(list.stream().filter(usPerson).collect(Collectors.toList()));
		System.out.println("Peoples From Surat-India");
		System.out.println(list.stream().filter(suratPerson).collect(Collectors.toList()));
		
		System.out.println("People's who's Age between 21-25");
		List<Person> agePerson=list.stream().filter((p)->p.getAge()>=21&&p.getAge()<=25).collect(Collectors.toList());
		agePerson.forEach(System.out::println);
	}
}
