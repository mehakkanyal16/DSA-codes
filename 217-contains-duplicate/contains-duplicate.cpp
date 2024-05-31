class Solution {
public:
    // bool containsDuplicate(vector<int>& nums) {
    //     int n=nums.size();
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    bool containsDuplicate(vector<int>&nums){
        sort(nums.begin(),nums.end());
        int n=nums.size();
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
};