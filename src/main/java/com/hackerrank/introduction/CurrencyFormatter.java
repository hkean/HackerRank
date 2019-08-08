package com.hackerrank.introduction;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.

//    	Double payment = 12324.134;
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("EN", "IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}
}
