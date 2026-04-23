class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Use long to avoid overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } 
            else if (square < x) {
                ans = mid;       // store possible answer
                start = mid + 1; // go right
            } 
            else {
                end = mid - 1;   // go left
            }
        }

        return ans;
    }
}