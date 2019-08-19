package com.hackerrank.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		if (testCases >= 1 && testCases <= 100) {
			int totalChar = 0;
			while (testCases > 0) {
				String line = in.nextLine();
				if (line.length() > 100000) {
					break;
				}
				totalChar += line.length();
				if (totalChar > 10000000) {
					break;
				}
				// Write your code here
				boolean matchFound = false;

//	            <(.+)> // matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.
//	            ([^<]+) // matches all the text in between the HTML start and end tags except "<" symbol
//	            </\\1> // is to match the HTML end brace. The \1 is here to match all text from Group #1.
				Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
				Matcher m = r.matcher(line);

				while (m.find()) {
					System.out.println(m.group(2));
					matchFound = true;
				}
				if (!matchFound) {
					System.out.println("None");
				}

				testCases--;
			}
		}
		in.close();
	}
}
