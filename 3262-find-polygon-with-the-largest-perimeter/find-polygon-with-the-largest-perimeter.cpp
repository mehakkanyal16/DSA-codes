class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
    //   sort(nums.begin(),nums.end());
    //   long long sum=0;
    //   long long ans=-1;
    //   for(int i=0;i<nums.size();i++){
    //       if(nums[i]<sum)
    //           ans=nums[i]+sum;
    //           sum=sum+nums[i];
    //   }
    //     return ans;  
    long long sum=0;
    sort(nums.begin(),nums.end());
    for(auto i:nums){
        sum=sum+i;
    } 
    int n=nums.size();
    for(int i=n-1;i>=0;i--){
        sum=sum-nums[i];
        if(sum>nums[i]){
            return sum+nums[i];
        }
    }
    return -1;
    }
};