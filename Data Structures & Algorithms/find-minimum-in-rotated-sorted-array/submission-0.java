class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater than end, min is in right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } 
            // Otherwise, min is in left half including mid
            else {
                end = mid;
            }
        }

        return nums[start]; // or nums[end]
    }
}