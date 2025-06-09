class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer>mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
        //     if(entry.getValue()>=2){
        //         return true;
        //     }
        // }
        // return false;

        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;
         HashSet<Integer>set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
         }
         if(set.size()==nums.length){
            return false;
         }
         return true;






        
    }
}