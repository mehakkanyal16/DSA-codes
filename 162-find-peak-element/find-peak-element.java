class Solution {
    public int findPeakElement(int[] arr) {
    //       int n=arr.length;
    //       int start=1;
    //       int end=n-2;
    //       while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
    //             return mid;
    //         }
    //         else if(arr[mid-1]<arr[mid]){
    //     start=mid+1;
    //    }
    //         else{
    //             end=mid-1;
    //         }
    //       }
    //       return -1;
        

        
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            end=mid;
        }
        else{
            start=mid+1;
        }
    }
    return start;

    }
}