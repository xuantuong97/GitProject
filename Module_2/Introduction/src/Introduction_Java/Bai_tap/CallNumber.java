package Introduction_Java.Bai_tap;

import java.util.Scanner;

public class CallNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        String[] zeroToTen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] elevenToNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] dozens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int unit = number % 10;
        int hundred = number / 100;
        int dozenValue = (number - hundred * 100) / 10;
        if (number >= 0 && number < 1000) {
            if (hundred != 0) {
                if (dozenValue == 0 && unit == 0) {
                    System.out.println(number + " is: " + zeroToTen[hundred] + " hundred");
                } else if (dozenValue == 0) {
                    System.out.println(number + " is: " + zeroToTen[hundred] + " hundred and " + zeroToTen[unit]);
                } else if (unit == 0) {
                    System.out.println(number + " is: " + zeroToTen[hundred] + " hundred and " + dozens[dozenValue - 1]);
                } else {
                    if (dozenValue == 1) {
                        System.out.println(number + " is: " + zeroToTen[hundred] + " hundred and " + elevenToNineteen[unit]);
                    } else {
                        System.out.println(number + " is: " + zeroToTen[hundred] + " hundred and " + dozens[dozenValue - 1] + " " + zeroToTen[unit]);
                    }
                }
            } else {
                if (dozenValue == 0) {
                    System.out.println(number + " is: " + zeroToTen[unit]);
                } else if (dozenValue == 1) {
                    System.out.println(number + " is: " + elevenToNineteen[unit]);
                } else if (unit == 0) {
                    System.out.println(dozens[dozenValue - 1]);
                } else {
                    System.out.println(number + " is: " + dozens[dozenValue - 1] + " " + zeroToTen[unit]);
                }
            }
        } else {
            System.out.println("out of ability");
        }
    }
}