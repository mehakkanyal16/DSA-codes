class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int leftsum=0;
        int rightsum=sum;
        for(int i=0;i<n;i++){
            rightsum=rightsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum=leftsum+nums[i];


        }
        return -1;
    }
};