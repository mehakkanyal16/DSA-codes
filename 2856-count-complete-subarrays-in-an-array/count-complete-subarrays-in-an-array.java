class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int cnt=0;
        int k=set.size();  //distinct elements in nums
        for(int i=0;i<n;i++){
            HashSet<Integer>seen=new HashSet<>();
            for(int j=i;j<n;j++){
                seen.add(nums[j]);
                if(seen.size()==k){
                    cnt++;
                   
                   

                }
           

            }
        
        }
             return cnt;
                
    }
}