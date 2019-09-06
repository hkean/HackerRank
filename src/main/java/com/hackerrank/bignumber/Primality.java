package com.hackerrank.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

// note: certainty = 1 meaning 1-(0.5)^1 = 50%
// thus it is better to put a bit higher but not too much
// such as 10 meaning 1-(0.5)^10 = 99%
public class Primality {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String n = scanner.nextLine();
		BigInteger input = new BigInteger(n);
		System.out.println((input.isProbablePrime(1) ? "prime" : "not prime"));

		scanner.close();
	}
}
