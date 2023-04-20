package week1.day4;

import week1.day2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 1;

        PrintHello printHello;
        printHello = new PrintHello();

        System.out.println(iVal);
        printHello.print();
    }
}
