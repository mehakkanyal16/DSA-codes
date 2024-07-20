class Solution {
    public int[][] restoreMatrix(int[] rowsum, int[] colsum) {
        int r=rowsum.length;
        int c=colsum.length;
        
        int result[][] =new int[r][c];
        int i=0;
        int j=0;
        while(i<r&&j<c){
            int x = Math.min(rowsum[i],colsum[j]);
             result[i][j]=x;
             rowsum[i]-=x;
             colsum[j]-=x;
             if(rowsum[i]==0){
                i++;
             }

             if(colsum[j]==0){
                j++;
             }
        }
        return result;

    }
}