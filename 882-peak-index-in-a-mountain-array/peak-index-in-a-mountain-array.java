class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=arr[0];
        int peak_ind=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
          if(arr[i]>max){
              max=arr[i];
              peak_ind=i;
          }

      }
      return peak_ind;

    }
}