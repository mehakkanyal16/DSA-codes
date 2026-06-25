class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIdx=0;
        int negIdx=1;
        int n=nums.length;
        int[] res=new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[posIdx]=nums[i];
                posIdx=posIdx+2;
            }
            else if(nums[i]<0){
                res[negIdx]=nums[i];
                negIdx=negIdx+2;

            }
        }
        return res;

        
        
    }
}