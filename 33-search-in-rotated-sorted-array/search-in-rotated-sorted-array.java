class Solution {
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
    public int pivotIndex(int[] nums){
        int start=0;
        int end=nums.length-1;
        if (nums[start] <= nums[end]) {
            return -1;
        }

      
        while(start<=end){
             int mid=start+(end-start)/2;
            if(mid<end&&nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]<=nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
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