package com.hackerrank.introduction;

import java.io.*;
import java.text.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String dayOfDate = "";

        DecimalFormat df2Digit = new DecimalFormat("00");
        SimpleDateFormat sdfDay = new SimpleDateFormat("EEEE");
        SimpleDateFormat sdfCustom = new SimpleDateFormat("ddMMyyyy");

        String dt = df2Digit.format(day) + df2Digit.format(month) + year;

        try {
            dayOfDate = sdfDay.format(sdfCustom.parse(dt));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        

        return dayOfDate.toUpperCase();
    }

}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
