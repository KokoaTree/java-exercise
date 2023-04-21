package week1.day5;

import week1.day2.PrintHello;

public class ConstantEx {
    public static final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 1;
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();
    }
}
