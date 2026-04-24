class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;

        // find max pile
        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canEat(piles, h, mid)) {
                ans = mid;      // possible answer
                end = mid - 1;  // try smaller k
            } else {
                start = mid + 1; // need bigger k
            }
        }

        return ans;
    }

    private boolean canEat(int[] piles, int h, int k) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k; // ceil division
        }

        return hours <= h;
    }
}