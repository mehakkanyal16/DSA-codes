class Solution {
    public int diagonalSum(int[][] mat) {
        // int n=mat.length;
        // int mid=n/2;
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     ans+=mat[i][i]+mat[i][n-i-1];
        // }
        // if(n%2==1){
        //     ans-=mat[mid][mid];
        // }
        // return ans;

        int sum=0;
        for(int i=0;i<mat.length;i++){
            // pd sum
            sum+=mat[i][i];
            // sd sum
            if(i!=mat.length-i-1){
                sum+=mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
}