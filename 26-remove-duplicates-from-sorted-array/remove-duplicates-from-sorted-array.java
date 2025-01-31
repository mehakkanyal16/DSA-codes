class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int write=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            
                nums[write++]=nums[i];
            }
        }
        return write;
        
    }
}