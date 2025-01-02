class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int n=nums.length;
        int cnt=1;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n-1;i++){
          
            if(nums[i]+1==nums[i+1]){
                cnt++;
            }else if(nums[i]!=nums[i+1]){
                al.add(cnt);
                cnt=1;
            }
        }
        al.add(cnt);
        return Collections.max(al);
    }

}