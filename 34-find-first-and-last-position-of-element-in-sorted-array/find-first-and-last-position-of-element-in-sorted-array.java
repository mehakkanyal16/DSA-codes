class Solution {
    public int lowerBound(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
           int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
     public int upperBound(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
          int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int lowerBound=lowerBound(nums,target);
        int upperBound=upperBound(nums,target);
        return new int[]{lowerBound,upperBound};
    }
}