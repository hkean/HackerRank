package com.hackerrank.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Integer input1 = sc.nextInt();
			Integer input2 = sc.nextInt();
			System.out.println(input1 / input2);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		sc.close();
	}
}
