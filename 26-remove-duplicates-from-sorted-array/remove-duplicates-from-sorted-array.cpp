class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        if(arr.empty()){
            return 0;
        }
        int index=1;
        int n=arr.size();
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
              arr[index++]=arr[i];
            }
        }
        return index;
    }
};