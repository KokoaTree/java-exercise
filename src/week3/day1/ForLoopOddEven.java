package week3.day1;

import java.util.Scanner;

public class ForLoopOddEven {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("짝수");
        for(int i = 1; i < 10; i++) {
            num = i;
            if (num % 2 == 0) {
                System.out.printf("%d ", num);
            }
        }
        System.out.println();
        System.out.println("홀수");
        for (int i = 0; i < 10; i++) {
            num = i;
            if (num % 2 == 1) {
                System.out.printf("%d ", num);
            }
        }
    }
}
