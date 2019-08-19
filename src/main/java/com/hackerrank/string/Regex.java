package com.hackerrank.string;

import java.util.Scanner;

public class Regex {
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	        in.close();

//		String[] arr = { "000.12.12.034", "121.234.12.12", "23.45.12.56", "00.12.123.123123.123", "122.23", "Hello.IP",
//				"003.111.123.123" };
//		for (String IP : arr) {
//			System.out.println(IP.matches(new MyRegex().pattern));
//		}
	}
}

class MyRegex {

	String idea = "\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b";
	String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

//	String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	String pattern = "(" + zeroTo255 + "\\.){3}" + zeroTo255;

}