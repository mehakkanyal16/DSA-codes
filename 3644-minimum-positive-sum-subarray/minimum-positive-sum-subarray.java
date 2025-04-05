class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<nums.size();i++){
            int sum=0;
            for(int j=i;j<nums.size();j++){
                sum+=nums.get(j);
                if(j-i+1>=l&&j-i+1<=r&&sum>0){
                    minSum=Math.min(minSum,sum);
                    found=true;
                }
            }
          
        }
          return found?minSum:-1;
    }
}