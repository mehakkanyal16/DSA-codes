class Solution {
    public int maxOfAdjacent(int[] nums){
        int n=nums.length;
        int prev=nums[0];
        int prev1=0;
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take+=prev1;
            }
            int not_take=prev;
            int curr=Math.max(take,not_take);
            prev1=prev;
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
       int[] temp1=new int[n+1];
       int[] temp2=new int[n+1];
       for(int i=0;i<n;i++){
        if(i!=0){
            temp1[i-1]=nums[i];
        }
        if(i!=n-1){
            temp2[i]=nums[i];
        }

       }
        return Math.max(maxOfAdjacent(temp1),maxOfAdjacent(temp2));
    }
}