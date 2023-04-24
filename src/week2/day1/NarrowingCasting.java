package week2.day1;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        int iVal = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);

        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);

        String val3 = "1.5";
        String val4 = "2.5";

        float result = Float.parseFloat(val3) + Float.parseFloat(val4);
        System.out.println("result = " + result);

    }
}
