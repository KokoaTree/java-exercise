package week3.day1;

public class MultiplicationTable2to4 {
    public static void main(String[] args) {

        System.out.println("====2단====");
        for(int i = 1; i < 10; i++) {
            System.out.printf("2 X %d = %2d\n", i, i * 2);
        }

        System.out.println("====3단====");
        for(int i = 1; i < 10; i++) {
            System.out.printf("3 X %d = %2d\n", i, i * 3);
        }

        System.out.println("====4단====");
        for(int i = 1; i < 10; i++) {
            System.out.printf("4 X %d = %2d\n", i, i * 4);
        }
    }
}
