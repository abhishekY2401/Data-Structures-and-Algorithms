/*
*   Insertion Sort
*   The approach is to divide the array into two parts
*   sorted part and the unsorted part
*
*    1st iteration
*   [45,67,12,23,56] -> [45 | 67,12,23,56] -> 45 < 67 so no swap takes place
*
*    2nd iteration
*   [45,67 | 12,23,56] -> 67 > 12. So swap 67 and 12 with each other
*   [45,12,67 | 23,56] -> when comparing from unsorted with sorted element traverse the whole unsorted part
*   and compare with the predecessor. -> 45 > 12. So swap 45 and 12 with each other
*
*    3rd iteration
*   [12,45,67 | 23,56] -> 67 > 23. So swap 67 and 23 with each other
*   [12,45,23,67 | 56] -> 45 > 23. So swap 45 and 23 with each other
*   [12,23,45,67 | 56] -> 12 < 23 no swap takes place
*
*    4th iteration
*   [12,23,45,67 | 56] -> 67 > 56. So swap 67 and 56 with each other
*   [12,23,45,56,67] -> 45 < 56 no swap takes place
*
* */

import java.util.*;

class insertionSort {

    public static void main(String[] args) {
        int[] arr = {45,23,67,89,12,1,34,25};

        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            arr[j+1] = key;
        }
    }
}