class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mcnt=0;
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt++;
                mcnt=Math.max(cnt,mcnt);
            }else{
                cnt=0;
            }



        }
        return mcnt;
        
    }
}