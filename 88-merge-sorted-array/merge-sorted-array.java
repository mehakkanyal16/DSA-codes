class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        int j=0;
        while(j<n){
            nums1[i]=nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
        // return nums1;
        
    }
}