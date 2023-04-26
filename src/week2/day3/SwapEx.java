package week2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
//        오름차순 정렬 알고리즘
        int[] arr = {2, 1, 4, 8, 7, 6};
        System.out.println(Arrays.toString(arr));

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

        System.out.println(Arrays.toString(arr));

        tmp = arr[3];
        arr[3] = arr[5];
        arr[5] = tmp;

        System.out.println(Arrays.toString(arr));
    }
}
