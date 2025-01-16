class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=cardPoints[i];
        }
        if (k == n) {
            return totalSum;
        }
        int windowSize = n - k;
        int currentWindowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += cardPoints[i];
        }

        int minWindowSum = currentWindowSum;

        // Slide the window across the array
        for (int i = windowSize; i < n; i++) {
            currentWindowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, currentWindowSum);
        }

        return totalSum - minWindowSum;

         
        
    }
}