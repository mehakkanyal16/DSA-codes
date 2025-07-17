class Solution {
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                swap(nums,lastNonZeroIndex,i);
                lastNonZeroIndex++;
            }
        }

        
    }
}