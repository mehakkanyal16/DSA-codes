class Solution {
    public boolean checkUnique(int[] nums,int start){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return false;
            }
            hs.add(nums[i]);
        }
        return true;
    }
    public int minimumOperations(int[] nums) {
       int ans=0;
       for(int i=0;i<nums.length;i=i+3){
        if(checkUnique(nums,i)){
            return ans;
        }
         ans++;
        
       }
       return ans;
        
    }
}