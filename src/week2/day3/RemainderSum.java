package week2.day3;

import java.util.Scanner;

public class RemainderSum {
    public static void main(String[] args) {
//        int num = 687;
//        int num = 891;
//        int num = 1234;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int val1 = num % 10; // --> 7
        num = num / 10; // 68
        int val2 = num % 10; // --> 8
        num = num / 10; // 6
        int val3 = num % 10; // --> 6
        num = num / 10;
//        int val4 = num % 10;
//        num = num / 10;

        System.out.println(val1 + val2 + val3);
    }
}
