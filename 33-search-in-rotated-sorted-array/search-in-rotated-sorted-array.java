class Solution {
    private int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    private int pivotIndex(int nums[]){
        // int n=nums.length;
        // int start=1;
        // int end=n-2;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
        //         return mid;
        //     }
        //     else if(nums[mid]<nums[mid-1]){
        //         start=mid+1;
        //     }
        //     else{
        //         end=mid-1;
        //     }
        // }
        // return -1;
       

       int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n=nums.length;
         if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int pivot=pivotIndex(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,n-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);

        }
        
        return binarySearch(nums,target,pivot+1,n-1);
        
    }    

}   

        
    
