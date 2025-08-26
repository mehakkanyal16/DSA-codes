class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        int maxArea=Integer.MIN_VALUE;
        int maxD=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int l=dimensions[i][0];
                int b=dimensions[i][1];
                int d=l*l+b*b;
                if(d>maxD||d==maxD&&l*b>maxArea){
                    maxArea=l*b;
                    maxD=d;
                }
               
            }
        }
        return maxArea;
    }
}