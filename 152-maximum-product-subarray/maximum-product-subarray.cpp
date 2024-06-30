class Solution {
public:
    int maxProduct(vector<int>& nums) {
        // int n=nums.size();
        // long long prefix=1;
        // long long suffix=1;
        // int ans=INT_MIN;
        // for(int i=0;i<n;i++){
        //     if(prefix==0) prefix=1;
        //     if(suffix==0)suffix=1;
        //     prefix=prefix*nums[i];
        //     suffix=suffix*nums[n-i-1];
        //     ans=max(ans,(int)max(prefix,suffix));
        // }
        // return ans;



          int n=nums.size();
        double pre=1,suf=1;
        double ans=INT_MIN;
        for(int i=0;i<n;i++)
        {
            if(pre==0)
                pre=1;
            if(suf==0)
                suf=1;
            pre*=nums[i];
            suf*=nums[n-1-i];
            ans=max(ans,max(suf,pre));
        }
        return ans;
    }
};