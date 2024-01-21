class Solution {
public:
    int findMin(vector<int>& nums) {
        int n=nums.size();
        int c=*min_element(nums.begin(),nums.end());
        return c;
        
    }
};