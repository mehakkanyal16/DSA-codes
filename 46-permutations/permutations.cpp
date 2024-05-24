class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result;
        permuteRec(nums, 0, result);
        return result;
        
    }
    void permuteRec(vector<int>&nums,int currentIndex,vector<vector<int>>&result){
        if(currentIndex==nums.size()-1){
            result.push_back(nums);
            return;
        }
        for(int i=currentIndex;i<nums.size();i++){
            swap(nums[currentIndex],nums[i]);
            permuteRec(nums,currentIndex+1,result);
            swap(nums[currentIndex],nums[i]);

        }
    }
};