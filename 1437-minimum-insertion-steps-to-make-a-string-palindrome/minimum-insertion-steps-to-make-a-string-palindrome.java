class Solution {
    public int f(int i,int j,String t1,String t2,int[][] dp){
            if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
         if(t1.charAt(i)==t2.charAt(j)){
            return 1+f(i-1,j-1,t1,t2,dp);
         }
         return dp[i][j]=Math.max(f(i-1,j,t1,t2,dp),f(i,j-1,t1,t2,dp));
    }
    public int lps(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return f(n-1,m-1,s1,s2,dp);
    }
    public int minInsertions(String s) {
        int n=s.length();
        String t=new StringBuilder(s).reverse().toString();
        int ans=lps(s,t);
        return n-ans;
    }
}