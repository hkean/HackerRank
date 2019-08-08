package com.hackerrank.introduction;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (scan.hasNextLine()) {
			System.out.println(i++ + " " + scan.nextLine());
		}
//		for (int j = 1; scan.hasNextLine(); j++) {
//			System.out.println(j + " " + scan.nextLine());
//		}
		scan.close();
	}
}
