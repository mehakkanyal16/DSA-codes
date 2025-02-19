class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(mp.containsKey(c)){
                return new int[]{mp.get(c),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
        
    }
}