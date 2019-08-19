package com.hackerrank.string;

import java.util.Scanner;

public class StringToken {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.

//		String s = "He is a very very good boy, isn't he?";
//		String s = " h";

		if (s.length() == 0) {
			System.out.println(0);
		} else {
			String delimiter = "[ !,?._'@]+";
			String[] arr = s.split(delimiter);

			int max = arr.length;
			System.out.println(max);

			for (int i = 0; i < max; i++) {
				System.out.println(arr[i]);
			}
		}

		scan.close();
	}
}
