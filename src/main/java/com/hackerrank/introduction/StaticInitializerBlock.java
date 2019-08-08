package com.hackerrank.introduction;

import java.util.*;

public class StaticInitializerBlock {

    static boolean flag = true;
    static int B = 0;
    static int H = 0;
    
    static {

        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
sc.nextLine();
        H = sc.nextInt();
        sc.close();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

