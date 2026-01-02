class Solution {
    public int repeatedNTimes(int[] nums) {
        int s=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<s;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
        int key=entry.getKey();
        int val=entry.getValue();
        if(val==s/2){
            return key;
        }
       }
       return 0;

    }
}