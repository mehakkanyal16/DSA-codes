class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            int c=target-nums[i];
            if(mp.containsKey(c)){
                return new int[]{mp.get(c),i};
            }
            mp.put(nums[i],i);

        }
        return new int[]{-1,-1};
    }
}