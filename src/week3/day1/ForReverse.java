package week3.day1;

public class ForReverse {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        for(int i = 10; i > 0; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        for(int i = 10; i >= 0; i--) {
            System.out.printf("%d ", i);
        }
    }
}
