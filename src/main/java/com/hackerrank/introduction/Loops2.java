package com.hackerrank.introduction;

import java.util.*;

public class Loops2{
    static final String SPACE = " ";

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            getOutput(a, b, n);

            System.out.println();
        }
        in.close();

    }

    public static void getOutput(int a, int b, int n) {
        int result = a;

        for (int i=0; i<n; i++) {
            result += Math.pow(2, i) * b;
            System.out.print(result + SPACE);
        }

    }
}
