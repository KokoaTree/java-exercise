package week2.day3;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[] arr0 = arr[0];
        arr0[0] = 1;

        int[] arr1 = arr[1];
        arr1[1] = 1;

        int[] arr2 = arr[2];
        arr2[2] = 1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
