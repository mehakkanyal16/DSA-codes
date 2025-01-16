class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int totalSum=0;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum+=cardPoints[i];
        }
        totalSum=currentSum;
        if (k == n) {
            return totalSum;
        }
        for(int i=0;i<k;i++){
        currentSum=currentSum-cardPoints[k-1-i]+cardPoints[n-1-i];
        totalSum=Math.max(currentSum,totalSum);


        }
        return totalSum;
        

       

         
        
    }
}