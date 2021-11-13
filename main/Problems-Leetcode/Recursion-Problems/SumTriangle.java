/*
Sum Triangle - 

Given an array of integers, print a sum triangle from it such that the first level has all 
array elements. From then, at each level number of elements is one less than the previous level
and elements at the current level be the sum of two consecutive elements in the previous level. 


Test Case 1 : 

Input : A = {1,2,3,4,5}

Output :      
[48]
[20, 28] 
[8, 12, 16]
[3, 5, 7, 9]
[1, 2, 3, 4, 5]

Test Case 2 : 

Input : A = {1}

Output : [1]

Test Case 3 : *--

Input : A = {}

Output : []
*/

import java.util.*;

public class SumTriangle {

    static void triangleArray(int[] arr) {

        // base case
        if (arr.length < 1) {
            return;
        }

        // inductive case
        int[] temp = new int[arr.length - 1];

        // add the current element and the next element and assign it to the temp
        // current position
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }

        // make a recursive call and pass the newly
        // created array
        triangleArray(temp);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        triangleArray(arr);
    }
}