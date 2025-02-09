class Solution {
    public long countBadPairs(int[] nums) {
       int n=nums.length;
       long count=(long)n*(n-1)/2;
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<n;i++){
        int diff=nums[i]-i;
        count=count-mp.getOrDefault(diff,0);
        mp.put(diff,mp.getOrDefault(diff,0)+1);
       }
       return count;
    }
}