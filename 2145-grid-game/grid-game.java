class Solution {
    public long gridGame(int[][] grid) {
        long topRowSum=0;
        long bottomRowSum=0;
        for(int i=0;i<grid[0].length;i++){
            topRowSum+=grid[0][i];
        }
        long ans=Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            topRowSum-=grid[0][i];
            long max=Math.max(topRowSum,bottomRowSum);
            bottomRowSum+=grid[1][i];
            ans=Math.min(ans,max);

        }
        return ans;
    }
}