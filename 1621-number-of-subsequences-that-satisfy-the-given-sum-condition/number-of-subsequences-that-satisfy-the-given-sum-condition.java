class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int cnt=0;

        int n = nums.length;
        int MOD = 1_000_000_007;

        // power[i] = 2^i % MOD
        int[] power = new int[n];
        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        while(left<=right){
            int sum=nums[left]+nums[right];
            if(sum<=target){
                cnt = (cnt + power[right - left]) % MOD;
                left++;

            }else{
                right--;
            }
        }
        return cnt;
    }
}