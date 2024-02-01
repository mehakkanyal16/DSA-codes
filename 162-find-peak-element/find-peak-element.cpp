class Solution {
public:
    int findPeakElement(vector<int>& nums) {
    //    int n = nums.size();
    //     for(int i=0; i<n-1; i++){
    //         if(nums[i] > nums[i+1]){
    //             return i;
    //         }
    //     }
    //     return n-1;
    // return max_element(nums.begin(),nums.end())-nums.begin();
    int start=0;
    int n=nums.size();
    int end=n-1;
    while(start<end){
        int mid=start+(end-start)/2;
        if(nums[mid]<nums[mid+1]){
            start=mid+1;
        }
        else{
            end=mid;
        }
    }
        return start;
    
    }
};