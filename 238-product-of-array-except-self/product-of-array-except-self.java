class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
       int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=1;
        }
        int left=1;
        int right=1;
        for(int i=0;i<n;i++){
            res[i]=res[i]*left;
            left=left*nums[i];
           
        }
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*right;
            right=right*nums[i];
        }
        return res;
    }
}