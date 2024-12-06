class Solution {
    public int f(int i,int j,String s,String t,int[][]dp){
        if(i<0||j<0){
            return 0;
        }
        if(s.charAt(i)==t.charAt(j)){
            return 1+f(i-1,j-1,s,t,dp);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=Math.max(f(i-1,j,s,t,dp),f(i,j-1,s,t,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }

         return f(n-1,m-1,text1,text2,dp);
    }
}