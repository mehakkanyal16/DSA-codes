class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
  
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        int sum=0;

        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(mp.containsKey(rem)){
                if(i-mp.get(rem)>1){
                    return true;
                }
            }else{
                mp.put(rem,i);
            }
            
        }
        return false;
        
    }
}