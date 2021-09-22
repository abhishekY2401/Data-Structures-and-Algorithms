import java.util.*;
// Make 3 functions :- 
// partition(), quicksort(), swap()

class quickSort {
    public static void main(String[] args) {
        int[] theArray = { 23, 45, 46, 57, 20, 39, 40 };
        System.out.print("The Unsorted Array is : ");
        System.out.println(Arrays.toString(theArray));

        quicksort(theArray);
        System.out.print("The Sorted Array is : ");
        System.out.println(Arrays.toString(theArray));
    }

    private static int partition(int[] theArray, int startIndex, int endIndex) {
        int pivot = theArray[endIndex];
        int leftIndex = startIndex;
        int rightIndex = endIndex - 1;

        while (leftIndex <= rightIndex) {

            // walk until we find something on the left side that belongs
            // on the right (less than the pivot).
            while (leftIndex <= endIndex && theArray[leftIndex] < pivot) {
                leftIndex += 1;
            }

            // walk until we find something on the right side that belongs
            // on the left (greater than or equal to the pivot).
            while (rightIndex >= startIndex && theArray[rightIndex] >= pivot) {
                rightIndex -= 1;
            }

            // swap the items at leftIndex and rightIndex, moving the element
            // that's smaller than the pivot to the left half and the element
            // that's larger than the pivot to the right half.
            if (leftIndex < rightIndex) {
                int tmp = theArray[leftIndex];
                theArray[leftIndex] = theArray[rightIndex];
                theArray[rightIndex] = tmp;
            }

            // unless we've looked at all the elements in the array and are
            // done partitioning. in that case, move the pivot element into
            // its final position.
            else {
                int tmp = theArray[leftIndex];
                theArray[leftIndex] = theArray[endIndex];
                theArray[endIndex] = tmp;
            }
        }

        return leftIndex;
    }

    private static void quicksortSubarray(int[] theArray, int startIndex, int endIndex) {

        // base case: array with 0 or 1 elements.
        if (startIndex >= endIndex) {
            return;
        }

        // divide the array into two smaller subarrays
        int pivotIndex = partition(theArray, startIndex, endIndex);

        // recursively sort each subarray
        quicksortSubarray(theArray, startIndex, pivotIndex - 1);
        quicksortSubarray(theArray, pivotIndex + 1, endIndex);
    }

    public static void quicksort(int[] theArray) {
        quicksortSubarray(theArray, 0, theArray.length - 1);
    }
}