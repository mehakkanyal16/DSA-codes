class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take=nums[i]+prev2;
            }
            int notTake=0+prev;
            int curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;

        }
        return prev;
    }
}