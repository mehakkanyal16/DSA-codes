class Solution {
    public int f(int i,int j,String s1,String s2,int[][] dp){
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=1+f(i-1,j-1,s1,s2,dp);
        }
        else{
            dp[i][j]=Math.max(f(i-1,j,s1,s2,dp),f(i,j-1,s1,s2,dp));
        }
        return dp[i][j];  
    }
    public int lcs(String s1,String s2){
        int n=s1.length();
        int t=s2.length();
        int dp[][] =new int[n+1][t+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return f(n-1,t-1,s1,s2,dp)
;    }
    public int longestPalindromeSubseq(String s) {
    
        String t=s;
        String reversed=new StringBuilder(s).reverse().toString();
        return lcs(s,reversed);
    }
}