package com.bridgelabz.java8.filterstring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStringUsingFilter {
	private static List<String> months = Arrays.asList("Jan", "Feb", "March", "April", "May", "Jun", "July", "Aug",
			"Sept", "Acto", "Nov", "dec");

	public static void main(String[] args) {
		List<String> result = months.stream().filter(month -> !"March".equals(month)).collect(Collectors.toList());
		System.out.println("Months Accepts March");
		result.forEach(System.out::println);
		
		
		System.out.println("Months Which Starts latter 'J'");
		List<String> result2 = months.stream().filter(month -> month.startsWith("J")).collect(Collectors.toList());
		result2.forEach(System.out::println);
		
		List<String> result3=months.stream().map(month->month.toUpperCase()).collect(Collectors.toList());
		System.out.println("All Moths with Capital Latters");
		result3.forEach(System.out::println);
	}

}
