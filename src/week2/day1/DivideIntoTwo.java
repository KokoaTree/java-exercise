package week2.day1;

    public class DivideIntoTwo {
        public static void main(String[] args) {
//        1 + 2 / 1
            float fOne = 1;
            float fTwo = 2;

            System.out.printf("%f\n", fOne + fOne / fTwo);

            int iOne = 1;
            int iTwo = 2;

            System.out.printf("%d\n", iOne + iOne / iTwo); // 소수 버림(반올림 X)

            System.out.printf("%d\n", 9 / 2);
            System.out.printf("%f\n", 9 / 2.0);
        }
}
