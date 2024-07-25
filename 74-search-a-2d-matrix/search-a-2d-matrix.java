class Solution {
  
  
    public boolean searchMatrix(int[][] mat, int target) {
        int i=0;

        int r=mat.length;
        int c=mat[0].length;
        int j=c-1;
        while(i>=0&&i<r&&j>=0&&j<c){
            
            if(mat[i][j]==target){
                return true;
            }
            else if(target>mat[i][j]){
                i++;

            }
            else{
                j--;
            }
        }
    return false;

        
    }
}