class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        // define search space
        for (int num : nums) {
            left = Math.max(left, num); // max element
            right += num; // total sum
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                result = mid;
                right = mid - 1; // try smaller
            } else {
                left = mid + 1; // need bigger
            }
        }

        return result;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrays = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrays++;
                currentSum = num;

                if (subarrays > k) return false;
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}