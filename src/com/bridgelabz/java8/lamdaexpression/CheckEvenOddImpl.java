package com.bridgelabz.java8.lamdaexpression;

import java.util.Scanner;

public class CheckEvenOddImpl{
	static CheckEvenOdd ch;
	static Scanner scanner=new Scanner(System.in);
	public static int checker(CheckEvenOdd p, int num) {
		return p.check(num);
	}

	CheckEvenOdd checkEvenOdd() {
		CheckEvenOdd p = (a) -> {
			return a % 2;
		};

		return p;
	}
	public static void main(String[] args) {
		System.out.println("Enter Number");
		int number=scanner.nextInt();
		CheckEvenOddImpl obj=new CheckEvenOddImpl();
		ch=obj.checkEvenOdd();
		String ans=(checker(ch, number)==0)?"Even":"Odd";
		System.out.println(ans);
	}
}
