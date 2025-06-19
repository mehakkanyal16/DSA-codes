class Solution {
      public int solve(int i,int j,String s1,String s2 ,int[][] dp){
        if(i<0||j<0)return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solve(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j]= Math.max(solve(i,j-1,s1,s2,dp),solve(i-1,j,s1,s2,dp));
    }
    public int lcs(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] it:dp){
            Arrays.fill(it,-1);
        }
        return solve(n-1,m-1,s1,s2,dp);

    }
    public int minDistance(String word1, String word2) {
      int deleteOperations=word1.length()-lcs(word1,word2);
      int insertOperations=word2.length()-lcs(word1,word2);
      return deleteOperations+insertOperations;

    }
}