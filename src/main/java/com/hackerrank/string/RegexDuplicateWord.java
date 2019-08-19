package com.hackerrank.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicateWord {

//	\b(\w+)(\b\W+\1\b)*
//
//	\b : Any word boundary <br/>(\w+) : Select any word character (letter, number, underscore)
//	
//	( : Grouping starts<br/>
//	\b : Any word boundary<br/>
//	\W+ : Any non-word character<br/>
//	\1 : Select repeated words<br/>
//	\b : Un select if it repeated word is joined with another word<br/>
//	) : Grouping ends
	public static void main(String[] args) {

		String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
		Pattern p = Pattern.compile(regex, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();

		new RegexDuplicateWord().solution();
	}

//	"(?i) \\b ([a-z]+) \\b (?: \\s+ \\1 \\b )+"
//
//	\b       match a word boundary
//	[a-z]+   match a word with one or more characters;
//	         the parentheses capture the word as a group    
//	\b       match a word boundary
//	(?:      indicates a non-capturing group (which starts here)
//	\s+      match one or more white space characters
//	\1       is a back reference to the first (captured) group;
//	         so the word is repeated here
//	\b       match a word boundary
//	)+       indicates the end of the non-capturing group and
//	         allows it to occur one or more times
	void solution() {
		/* Write a RegEx matching repeated words here. */
		String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
		/* Insert the correct Pattern flag here. */
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		String[] in = { "I love Love to To tO code", "Goodbye bye bye world world world",
				"Sam went went to to to his business", "Reya is is the the best player in eye eye game", "in inthe",
				"Hello hello Ab aB" };
		for (String input : in) {
			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				// /* The regex to replace */, /* The replacement. */
				input = input.replaceAll(m.group(), m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

	}
}
