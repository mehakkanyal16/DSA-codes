class Solution {
    public int specialArray(int[] nums) {
    
        Arrays.sort(nums);
        int s=0;
        int e=nums.length;
       
        while(s<=e){
             int ans=0;
            int mid=s+(e-s)+1/2;
            for(int x :nums){
                if(x>=mid){
                    ans++;
                }
            }
            if(ans==mid){
                return mid;
            }
            else if(ans>mid){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;

        
    }
}