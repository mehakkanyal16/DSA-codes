class Solution {
    private void swap(int[] nums,int t,int i){
        int temp=nums[t];
        nums[t]=nums[i];
        nums[i]=temp;
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