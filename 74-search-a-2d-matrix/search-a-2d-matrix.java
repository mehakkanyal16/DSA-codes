class Solution {
    public static boolean binarySearch(int[] row ,int target){
        int start=0;
        int end=row.length-1;
         while (start <= end) {  // Corrected condition (<=)
            int mid = start + (end - start) / 2;  // 
            if(row[mid]==target){
                return true;
            }else if(row[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
          if(binarySearch(matrix[i],target)){
            return true;
          }
        }
        return false;
        
    }
}