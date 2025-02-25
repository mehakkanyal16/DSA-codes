class Solution {
  
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int n=nums1.length;
        int m=nums2.length;
        int total_len=n+m;
        int midIndex=total_len/2;
        int count=0;
        int i=0,j=0;
        int curr=0;
        int prev=0;
        while(count<=midIndex){
            prev=curr;
             if((i < n && (j >= m || nums1[i] < nums2[j])) ){
                curr=nums1[i];
                i++;
            
              }else{
                curr=nums2[j];
                j++;
              }
              count++;
        }
         if (total_len % 2 != 0) {
            return curr;
        }

        // If even, return the average of the two middle elements
        return (prev + curr) / 2.0;

        
    }
}