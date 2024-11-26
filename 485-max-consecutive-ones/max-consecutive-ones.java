class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int maxcnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt=cnt+1;
                maxcnt=Math.max(maxcnt,cnt);
            }else{
                cnt=0;
            }
        }
        return maxcnt;
    }
}