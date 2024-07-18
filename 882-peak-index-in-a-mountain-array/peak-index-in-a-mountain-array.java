class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    //     int max=arr[0];
    //     int peak_ind=-1;
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //       if(arr[i]>max){
    //           max=arr[i];
    //           peak_ind=i;
    //       }

    //   }
    //   return peak_ind;

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