class Solution {
public:
    vector<int> runningSum(vector<int>& arr) {
        int n=arr.size();
        vector<int>res;
        int sum=0;
for(int i=0;i<n;i++){
  
   sum=sum+arr[i];
   res.push_back(sum);
}
    return res;    
    }
};