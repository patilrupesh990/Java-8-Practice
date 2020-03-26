package com.bridgelabz.java8.lamdaexpression;

import java.util.Scanner;

public class CheckPalindromImpl {
	static CheckPalindrom checkPalindrome;
	static Scanner scanner = new Scanner(System.in);

	CheckPalindrom checkPalindrome() {
		CheckPalindrom p = (a) -> {
			String word = "" + a;
			boolean isPalindrome = true;
			for (int i = 0; i < (int) word.length() / 2; i++) {
				if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					isPalindrome = false;
					break;

				}
			}
			return isPalindrome ? 0 : 1;
		};
		return p;
	}

	public static void main(String[] args) {
		CheckPalindromImpl object=new CheckPalindromImpl();
		checkPalindrome=object.checkPalindrome();
		
		System.out.println("Enter Number");
		String answer=(checkPalindrome.checkPalindrom(scanner.nextInt())==0)?"Number is Palindrom":"Not Palindrom";
		System.out.println(answer);
	}

}
