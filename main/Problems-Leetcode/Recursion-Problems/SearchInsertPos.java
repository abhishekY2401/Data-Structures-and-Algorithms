public class SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = {23,45,67,89,90};
        int target = 45;

        searchInsert(nums, target);
    }

    public static void searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end-start) / 2;

            // it will return if it gets the element
            if (target == nums[mid]) {
                found = true;
                System.out.println("Element found at " + mid);
                break;
            }

            else if (target < nums[mid])
                end = mid-1;

            else
                start = mid+1;
        }
        // it will return the insert index if the element is not found
        if (!found) {
            System.out.println("Element can be inserted at " + start);
        }
    }
}
