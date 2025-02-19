class Solution {
    public  int binarySearch(int nums[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            return binarySearch(nums,mid+1,end,target);
        }else {
            return binarySearch(nums,start,mid-1,target);
        }

    }
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
       return binarySearch(nums,s,e,target);
        
    }
}