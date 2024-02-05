class Solution {

    // int smallestDivisor(vector<int>& nums, int threshold) {
    //     int n=nums.size();
    //     int max=*max_element(nums.begin(),nums.end());
    //     for(int i=1;i<=max;i++){
    //         int sum=0;
    //         for(int j=0;j<n;j++){
    //             sum=sum+ceil(((double)nums[j])/((double)(i)));

    //         }
    //         if(sum<=threshold){
    //             return i;
    //         }
    //     }
    //     return -1;
        
    // }

    private:
    int sumD(vector<int>&nums,int mid){
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+ceil((double)nums[i]/(double)(mid));
        }
        return sum;
    }
    public:
    int smallestDivisor(vector<int>&nums,int threshold){
        int n=nums.size();
        int start=1;
        
        //int high=*max_element(nums.begin(),nums.end());
        if(n>threshold)return -1;
        int end=*max_element(nums.begin(),nums.end());
        while(start<=end){
            int mid=(end+start)/2;
            if(sumD(nums,mid)<=threshold){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
};