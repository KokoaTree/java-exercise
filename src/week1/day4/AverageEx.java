package week1.day4;

import java.util.Scanner;

public class AverageEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("%.1f", ((scan.nextFloat() + scan.nextFloat() + scan.nextFloat()) / 3));
    }
}
