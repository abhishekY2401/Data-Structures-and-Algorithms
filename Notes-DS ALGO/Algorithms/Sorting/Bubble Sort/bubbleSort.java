import java.util.*;

class bubbleSort {

	// After every pass one biggest element from the array gets sorted in correct position.
	// biggest element gets placed at the last position after every passes
	// this is how the whole array is sorted in O(n^2) because we are iterating 2 times in the same array.
	// The running time complexity is O(n^2) in the worst case.
  
  // This will sort the array in the Ascending Order.
	static void BubbleSort(int[] arr) {
		int n = arr.length;  // calculates the length of the array
    
    // parses the whole array for n elements 
		for (int i = 0; i < n-1; i++) {

			// iterates from 1 to array's length minus the the current outer iteration
			for (int j = 1; j < n-i; j++) {
				if (arr[j] < arr[j - 1]) {

						// Swapping elements if the previous element is greater than current element
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
				}
			}
		}
	}
  
    public static void main(String[] args) {
			
		        // The unsorted array 
			int[] arr = {23, 45, 12, 20, 19, 8};

			System.out.println("The elements in the array before sorting : ");    
			System.out.println(Arrays.toString(arr));

			// when we call the bubble sort function it sorts the elements inside the array
			BubbleSort(arr);
			System.out.println("The elements in the array after sorting : ");   
			System.out.println(Arrays.toString(arr));
  }
}

// For sorting the array in descending order compare in such a manner whether the current element is greater than previous element.
// For sorting the array in asccending order compare in such a manner whether the current element is less than previous element.
// hope it draws an idea in your mind :)
