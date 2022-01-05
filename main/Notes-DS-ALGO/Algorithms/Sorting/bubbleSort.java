/*

     Algorithm :- Takes two adjacents elements compares both of them and swap them if not in order
     It takes n - 1 passes to sort the array

     First Pass
*    (5,1,4,2,8) -> (1,5,4,2,8) => 5 > 1. So swap 5 and 1 with each other
*    (1,5,4,2,8) -> (1,4,5,2,8) => 5 > 4. So swap 5 and 4 with each other
*    (1,4,5,2,8) -> (1,4,2,5,8) => 5 > 2. So swap 5 and 2 with each other
*    (1,4,2,5,8) -> (1,4,2,5,8) => 5 < 8. So no swap takes place

     Second Pass
*    (1,4,2,5,8) -> (1,4,2,5,8) => 1 < 4. So no swap takes place
*    (1,4,2,5,8) -> (1,2,4,5,8) => 4 > 2. So swap 4 and 2 with each other
*    (1,2,4,5,8) -> (1,2,4,5,8) => 2 < 5. So no swap takes place
*    (1,2,4,5,8) -> (1,2,4,5,8) => 5 < 8. So no swap takes place


     Now the whole array is sorted but our algorithm needs one more pass to verify
     whether the array is sorted or not.

     Third Pass
     (1,2,4,5,8) -> (1,2,4,5,8)
     (1,2,4,5,8) -> (1,2,4,5,8)
     (1,2,4,5,8) -> (1,2,4,5,8)
     (1,2,4,5,8) -> (1,2,4,5,8)

     Now the array is sorted -> (1,2,4,5,8)

     After every pass one highest element is getting sorted at the last
     so len - row - 1 means it will not visit the last position for subsequent passes.
*
* */

import java.util.*;

class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {89, 67, 12, 90, 34, 55, 60, 20};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= len-i-1; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}