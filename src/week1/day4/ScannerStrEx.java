package week1.day4;

import java.io.IOException;
import java.util.Scanner;


public class ScannerStrEx {
    public static void inputStringsAndPlus() throws IOException {
        Scanner str = new Scanner(System.in);
        String isString = str.next();
        String isString2 = str.next();

        System.out.println(isString + isString2);

    }
}