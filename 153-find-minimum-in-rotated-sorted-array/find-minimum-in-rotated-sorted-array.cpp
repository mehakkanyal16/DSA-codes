class Solution {
public:
    int findMin(vector<int>& arr) {
        // int n=nums.size();
        // int c=*min_element(nums.begin(),nums.end());
        // return c;
        int n=arr.size();
        int start=0;
        int end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return arr[start];
        
    }
};