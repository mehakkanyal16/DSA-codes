class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer,Integer>mp=new HashMap<>();
    for(int num:nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
    }
    //  if(mp.size()<2)return false;
     if(mp.size()==nums.length) return false;
    for  (Map.Entry<Integer,Integer>entry:mp.entrySet()){
       if(entry.getValue()>=2)return true;
    }

     return true;
    }
}