class Solution {
    public int digitSum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int maxSum=-1;
        HashMap<Integer,Integer>mp=new HashMap<>();
   
        
        for(int i=0;i<nums.length;i++){
            int sum=digitSum(nums[i]);
            if(mp.containsKey(sum)){
                maxSum=Math.max(maxSum,nums[i]+mp.get(sum));
                mp.put(sum, Math.max(mp.get(sum), nums[i]));
  
            }else{
                mp.put(sum,nums[i]);

            }
        }
        return maxSum;
        
    }
}