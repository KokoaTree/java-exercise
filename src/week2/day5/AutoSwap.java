package week2.day5;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9};
        boolean check = arr[0] > arr[1];

        if(check) {
            int tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
