package com.hackerrank.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;
		a = a.toLowerCase();
		b = b.toLowerCase();
		int index;
		for (int i = 0; i < a.length(); i++) {
			index = b.indexOf(a.charAt(i));
			if (index == -1)
				return false;
			else {
				// this removes b[index]
				b = b.substring(0, index) + b.substring(index + 1);
			}
		}
		return true;
	}

	static boolean isAnagram2(String a, String b) {

		// test for invalid input
		if (a == null || b == null || a.equals("") || b.equals(""))
			throw new IllegalArgumentException();

		// initial quick test for non-anagrams
		if (a.length() != b.length())
			return false;

		a = a.toLowerCase();
		b = b.toLowerCase();

		// populate a map with letters and frequencies of String b
		Map<Character, Integer> map = new HashMap<>();

		for (int k = 0; k < b.length(); k++) {
			char letter = b.charAt(k);

			if (!map.containsKey(letter)) {
				map.put(letter, 1);
			} else {
				Integer frequency = map.get(letter);
				map.put(letter, ++frequency);
			}
		}

		// test each letter in String a against data in the map
		// return if letter is absent in the map or its frequency is 0
		// otherwise decrease the frequency by 1

		for (int k = 0; k < a.length(); k++) {
			char letter = a.charAt(k);

			if (!map.containsKey(letter))
				return false;

			Integer frequency = map.get(letter);

			if (frequency == 0)
				return false;
			else
				map.put(letter, --frequency);
		}
		// if the code got that far it is an anagram
		return true;
	}

	static boolean isAnagram1(String a, String b) {
		// Complete the function
//		boolean result = true;

		if (a.length() != b.length()) {
			return false;
		}

		char[] chA = a.toLowerCase().toCharArray();
		char[] chB = b.toLowerCase().toCharArray();

		java.util.Arrays.sort(chA);
		java.util.Arrays.sort(chB);

		for (int i = 0; i < chA.length; i++) {
			if (chA[i] != chB[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
