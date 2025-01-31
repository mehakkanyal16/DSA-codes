class Solution {
    public int majorityElement(int[] nums) {
        int ans=-1;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i])>nums.length/2){
                ans=nums[i];
            }
        }
        return ans;
    }
}