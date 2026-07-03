class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        // Use a simple loop to find max to avoid sorting
        for (int p : piles) {
            end = Math.max(end, p);
        }
        
        int ans = end;
        
        while (start <= end) {
            // Safe midpoint calculation
            int mid = start + (end - start) / 2;
            
            // Use long to prevent overflow during sum
            if (calculateHours(piles, mid) <= (long) h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private long calculateHours(int[] piles, int speed) {
        long totalH = 0;
        for (int bananas : piles) {
            // Using long cast to ensure (bananas + speed - 1) doesn't overflow
            totalH += ((long) bananas + speed - 1) / speed;
        }
        return totalH;
    }
}