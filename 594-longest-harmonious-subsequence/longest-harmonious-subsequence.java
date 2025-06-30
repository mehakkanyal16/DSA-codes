class Solution {
    public int findLHS(int[] nums) {
        int maxLen=0;
        int n=nums.length;
     HashMap<Integer,Integer>mp=new HashMap<>();
     for(int i=0;i<n;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
     }
    for(int num:mp.keySet()){
        if(mp.containsKey(num+1)){
            int curr=mp.get(num)+mp.get(num+1);
            maxLen=Math.max(maxLen,curr);
        }
    }
    return maxLen;
        
    }
}