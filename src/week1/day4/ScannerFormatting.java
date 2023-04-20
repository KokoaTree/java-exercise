package week1.day4;

import java.util.Scanner;

public class ScannerFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.printf("%d", scan.nextInt() + scan.nextInt());
        int val1 = scan.nextInt();
        int val2 = scan.nextInt();

        System.out.printf("%d와 %d의 합은 %d입니다.", val1, val2, val1 + val2);
    }
}
