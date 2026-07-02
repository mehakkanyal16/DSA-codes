class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
    while (start < end) {
    int mid = start + (end - start) / 2;

    if (nums[mid] > nums[end]) {
        start = mid + 1;
    } else {
        end = mid;
    }
}
return start;
 
    }
     public int binarySearch(int[] nums,int start,int end,int target){
       
        while(start<=end){
             int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public int search(int[] nums, int target) {

        int pivot=pivotIndex(nums);
        int n=nums.length;
        if(pivot==0){
            return binarySearch(nums,0,n-1,target);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return binarySearch(nums,0,pivot-1,target);
        }
            return binarySearch(nums,pivot+1,nums.length-1,target);


        
    }
}