class Solution {
    public int jump(int[] nums) {
        int maxReach = 0;
        int jump = 0;
        int pos = 0;
        for(int i = 0; i<nums.length - 1; i++){
            maxReach = Math.max(maxReach, i + nums[i]);
            if(i == pos){
                pos = maxReach;
                jump++;
            }
        }

        return jump;
    }
}