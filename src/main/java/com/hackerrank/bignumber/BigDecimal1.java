package com.hackerrank.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimal1 {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

//		int n = 9;
//		String[] s = { "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };

		// Write your code here
		// solution using Comparator
		Arrays.sort(s, 0, n, Comparator.comparing(BigDecimal::new, Comparator.reverseOrder()));

		// or solution using reverseOrder and override Comparator
		Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return new BigDecimal(s1).compareTo(new BigDecimal(s2));
			}
		}));

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
