class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        // Find range
        for (int w : weights) {
            low = Math.max(low, w);  // max element
            high += w;              // total sum
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;
                high = mid - 1;  // try smaller
            } else {
                low = mid + 1;   // need bigger capacity
            }
        }

        return ans;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 1;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return requiredDays <= days;
    }
}