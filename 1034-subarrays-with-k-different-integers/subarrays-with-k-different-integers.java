class Solution {
     public int atmost(int[] nums,int k){
         int left=0;
         int unique=0;
         int cnt=0;
       int[] freq = new int[20001];  // Based on constraints: nums[i] ≤ 20000

         for(int right=0;right<nums.length;right++){
            if(freq[nums[right]]==0){
                unique++;
            }
            freq[nums[right]]++;
            while(unique>k){
                freq[nums[left]]--;
                if(freq[nums[left]]==0){
                    unique--;
                }
                left++;
            }
            cnt+=right-left+1;
         }
         return cnt;
     
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}