package com.bridgelabz.java8.lamdaexpression;

import java.util.Scanner;

public class CheckDivisibleBy15Impl {
	static CheckDivisbleBy15 checkdivisible;
	static Scanner scanner = new Scanner(System.in);

	CheckDivisbleBy15 isDivisible(String S) {
		CheckDivisbleBy15 checkDivisible = (a) -> {
			int n = S.length();

			if (S.charAt(n - 1) != '5' && S.charAt(n - 1) != '0')
				return false;

			int sum = 0;
			for (int i = 0; i < S.length(); i++)
				sum += (int) S.charAt(i);

			if (sum % 3 == 0)
				return true;
			else
				return false;
		};
		return checkDivisible;
	}

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		String number=scanner.nextLine();
		CheckDivisibleBy15Impl check=new CheckDivisibleBy15Impl();
		checkdivisible=check.isDivisible(number);
		String answer=(checkdivisible.checkDivisible(number)==true)?"divisible":"Not divisible";
		System.out.println(answer);
		
		
	}
}
