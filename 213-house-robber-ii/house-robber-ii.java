class Solution {
    public int maxValue(int[] nums,int ind){
      
         int prev2=0;
         int prev=nums[0];
         int n=nums.length;
         for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take=nums[i]+prev2;
            }
            int not_take=0+prev;
            int curr=Math.max(take,not_take);
            prev2=prev;
            prev=curr;

         }
         return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        int[] a1=new int[n];
        int[] a2=new int[n];
        for(int i=0;i<n;i++){
            if(i!=0){
                a1[i-1]=nums[i];
            }
            if(i!=n-1){
                a2[i]=nums[i];
            }
        }
        return Math.max(maxValue(a1,n-1),maxValue(a2,n-1));
       

        
    }
}