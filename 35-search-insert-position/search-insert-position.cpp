class Solution {
public:
    int searchInsert(vector<int>& arr, int target) {
        int n=arr.size();
        int start=0;
        
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
            start=mid+1;
            }
            else{
             end=mid-1;
            }
        }
      return start;  
    }
};