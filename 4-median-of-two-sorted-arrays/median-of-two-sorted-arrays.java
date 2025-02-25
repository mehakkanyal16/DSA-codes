class Solution {
    public static int[] merge(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[] res=new int[n+m];
        int i=0;
        int j=0;
        int idx=0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                res[idx++] = nums1[i++];
            } else {
                res[idx++] = nums2[j++];
            }
        }
        while(i<n){
            res[idx++]=nums1[i];
            i++;
        }
        while(j<m){
            res[idx++]=nums2[j];
            j++;
        }
        return res;



    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int n=nums1.length;
        int m=nums2.length;
        int[] res=new int[n+m];
         res=merge(nums1,nums2);
         if(res.length%2!=0){
            return (double)(res[res.length/2]);

         }else{
            return (double)(res[res.length/2]+res[res.length/2-1])/2;
         }

        
    }
}