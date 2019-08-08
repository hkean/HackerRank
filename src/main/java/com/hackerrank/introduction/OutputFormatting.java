package com.hackerrank.introduction;

import java.util.Scanner;
import java.text.DecimalFormat;

public class OutputFormatting {

    private static Scanner sc;

	public static void main(String[] args) {

        String pattern = "000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            System.out.println(String.format("%-15s", s1) + decimalFormat.format(x));
        }
        System.out.println("================================");

    }
}



