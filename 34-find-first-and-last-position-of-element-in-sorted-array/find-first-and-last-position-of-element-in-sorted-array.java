class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first_pos=-1;
      int last_pos=-1;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            if(first_pos==-1){
                first_pos=i;
            }
            last_pos=i;
        }
      }
      return new int[]{first_pos,last_pos};
    }
}