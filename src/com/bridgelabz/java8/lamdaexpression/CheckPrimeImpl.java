package com.bridgelabz.java8.lamdaexpression;

import java.util.Scanner;

public class CheckPrimeImpl {
	static CheckPrime checkPrime;
	static Scanner scanner = new Scanner(System.in);

	CheckPrime checkPrime() {
		CheckPrime p = (a) -> {
			if (a == 1)
				return 1;
			for (int i = 2; i < a / 2 + 1; i++) {
				if ((a % i) == 0)
					return 1;
			}
			return 0;
		};
		return p;
	}
	public static void main(String[] args) {
		CheckPrimeImpl object=new CheckPrimeImpl();
		checkPrime=object.checkPrime();
		System.out.println("Enter Number");
		int number=scanner.nextInt();
		String answer=(checkPrime.checkPrime(number)==0)?"Prime Number":"Not Prime";
		System.out.println(answer);
	}

}
