class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxcount=1;
        int currentcount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                currentcount++;
            }else{
                maxcount=Math.max(currentcount,maxcount);
                currentcount=1;
            }
        }
        return Math.max(currentcount,maxcount);
    }
}