package week2.day5;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        int projCount = sc.nextInt();

        if (years > 5 || projCount > 10) {
            System.out.println("팁장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
