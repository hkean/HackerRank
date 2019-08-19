package com.hackerrank.string;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		String result = "Yes";
		char[] tmp = A.toCharArray();
		int max = A.length() - 1;

		for (int i = 0; i < max / 2; i++) {
			if (tmp[i] != tmp[max - i]) {
				result = "No";
				break;
			}
		}
		System.out.println(result);

		sc.close();
	}
}
