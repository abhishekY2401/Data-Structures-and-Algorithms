/*
*  Merge Sort is a divide and conquer sorting algorithm which runs faster than other sorting algorithms
*
*  Time Complexity - O(n log n)
*
*                              [45,67,12,23,56]            --
*                                  /     \                  |
*                         [45,67,12]     [23,56]            |
*                           /  \          /  \              |--- Dividing the array in each mergesort calls
*                    [45,67]   [12]    [23]   [56]          |
*                     /  \      |       |      |            |
*                 [45]   [67] [12]    [23]   [56]          --
*                   \    /     |        \    /
*                  [45,67]   [12]      [23,56]             --
*                       \     /          |                  |
*                     [12,45,67]      [23,56]               |
*                            \        /                     |--- Conquering the array in each merge calls
*                         [12,23,45,56,67]                 --
*
*
*/
import java.util.*;

class mergeSort {
    public static void main(String[] args) {
        int[] arr = {34, 78, 12, 23, 90, 20};
        int first = 0;
        int last = arr.length-1;

        mergesort(arr, first, last);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int f, int l) {
        if (f < l) {
            int mid = (f + l) / 2;

            // divide the array in each calls
            mergesort(arr, f, mid);
            mergesort(arr, mid+1, l);

            // merge the array
            merge(arr, f, mid, l);
        }
    }

    private static void merge(int[] arr, int f, int m, int l) {
        int size_1 = m - f + 1;
        int size_2 = l - m;

        int L[] = new int[size_1];
        int M[] = new int[size_2];

        for (int i=0; i<size_1; i++) {
            L[i] = arr[f + i];
        }

        for (int j=0; j<size_2; j++) {
            M[j] = arr[m + 1 + j];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = f;

        while (i < size_1 && j < size_2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        // if one array is finished comparing and other is still remaining
        while (i < size_1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // if one array is finished comparing and other is still remaining
        while (j < size_2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }
}