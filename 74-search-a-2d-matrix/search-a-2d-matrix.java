class Solution {
    public static boolean binarySearch(int[] row,int target){
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
        int start=0;
        int end=matrix.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=matrix[mid][0]&&target<=matrix[mid][matrix[mid].length - 1]){
                // search in current row
                return binarySearch(matrix[mid],target);


            }else if(target > matrix[mid][matrix[mid].length - 1]){
                // search in down
                start=mid+1;
            }else{
                // search in up
                end=mid-1;
            }
        }
        return false;
        

    }
}