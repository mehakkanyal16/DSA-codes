class Solution {
    public void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
         for(int i=n/2-1;i>=0;i--){
            heapify(nums,n,i);
         }
         for(int i=n-1;i>0;i--){
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            heapify(nums,i,0);
         }
         return nums[n-k];



    }
}