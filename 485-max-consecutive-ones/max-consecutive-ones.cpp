class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& arr) {
        int n=arr.size();
        int count=0;
        int maxOnes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                
                count=0;
            }
            else{
                count++;
            }
            maxOnes=max(maxOnes,count);
            
        }
     return maxOnes;  
    }
};