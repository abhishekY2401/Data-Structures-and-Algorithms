/*
*  Let's consider an array [34, 45, 12, 9, 78, 90]
*
*  array - [34, 45, 12, 9, 78, 90]
*  - Pick up the smallest element from the array in each iteration
*  - Place it at the beginning of the array
*  - This reduces the iteration for inner loop
*
*  Initialize min, i and j
*
*  [34, 45, 12, 9, 78, 90]  =>  [34, 45, 12, 9, 78, 90]  =>   [34, 45, 12, 9, 78, 90]
*  m,i  j                       m,i  j                         i      m,j
*
*  [34, 45, 12, 9, 78, 90]  =>  [34, 45, 12, 9, 78, 90]  =>   [34, 45, 12, 9, 78, 90]
*   i       m   j                i          m,j                i           m   j
*
*   [34, 45, 12, 9, 78, 90]  =>  [34, 45, 12, 9, 78, 90]  =>   [34, 45, 12, 9, 78, 90]
*    i       m   j                i          m,j                i           m   j
*
*   [34, 45, 12, 9, 78, 90]  =>  swap(m, i) => [9, 45, 12, 34, 78, 90]
*    i           m      j
*
*    Like wise the sorting will take place in each inner iterations..
*
*    We are comparing on this case -> (arr[min] < arr[j])
*
* */

import java.util.*;

class selectionSort {
    public static void main(String[] args) {
        int[] arr = {34, 12, 78, 90, 56, 60};

        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len-1; i++) {
            int min = i;
            for (int j = i+1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}