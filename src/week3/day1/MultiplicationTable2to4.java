package week3.day1;

public class MultiplicationTable2to4 {
    public static void printDan(int dan) {
        for (int j = dan; j <= dan; j++) {
            System.out.printf("====%d단====\n", j);
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
            }
        }
    }

    public static void main(String[] args) {
        printDan(2);
        printDan(3);
        printDan(4);
        printDan(5);
        printDan(6);
    }
}
