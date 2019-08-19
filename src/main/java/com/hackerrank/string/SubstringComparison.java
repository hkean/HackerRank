package com.hackerrank.string;

public class SubstringComparison {
	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;

		System.out.println(getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, 0 + k);
		String largest = s.substring(0, 0 + k);

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		for (int i = 1; i <= s.length() - k; i++) {
			String tmp = s.substring(i, i + k);
//			System.out.println(tmp);
			if (smallest.compareTo(tmp) > 0) {
				smallest = tmp;
			} else if (largest.compareTo(tmp) < 0) {
				largest = tmp;
			}
//			System.out.println(smallest + "\n" + largest);
		}

		return smallest + "\n" + largest;
	}
}
