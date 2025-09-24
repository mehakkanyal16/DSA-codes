class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int prefix=0;
        int cnt=0;
        for(int num:nums){
            prefix+=num;
            cnt+=mp.getOrDefault(prefix-goal,0);
            mp.put(prefix,mp.getOrDefault(prefix,0)+1);

        }
        return cnt;
    }
}