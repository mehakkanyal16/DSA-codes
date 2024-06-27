class Solution {
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int lastNonZeroIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                swap(nums,lastNonZeroIndex,i);
                lastNonZeroIndex++;
            }
        }
        
    }
}