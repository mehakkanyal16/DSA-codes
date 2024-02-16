class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
    //     for(int i=0;i<nums.size()-1;i++){
    //         for(int j=i+1;j<nums.size();j++){
    //             if(nums[i]+nums[j]==target){
    //                 return {i,j};
    //             }
    //         }
            
    //     }
    //     return {};
        vector<pair<int,int>>numswithindex;
        for(int i=0;i<nums.size();i++){
            numswithindex.push_back({nums[i],i});
        }
        sort(numswithindex.begin(),numswithindex.end());
        int start=0;
        int end=nums.size()-1;
        while(start<end){
            int sum=numswithindex[start].first+numswithindex[end].first;
            if(sum==target){
                return {numswithindex[start].second,numswithindex[end].second};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return {};
     }
};