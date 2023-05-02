package week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int answer = 1;

        for (int i = n; i >= 1; i--) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
