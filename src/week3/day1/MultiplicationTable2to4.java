package week3.day1;

public class MultiplicationTable2to4 {

    public static void main(String[] args) {
        for(int i = 2; i <= 4; i++) {
            System.out.println("====" + i + "단====");
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %2d\n", i, j, i * j);
            }
        }
    }
}
