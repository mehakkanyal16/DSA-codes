class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        // if(arr.empty()){
        //     return 0;
        // }
        // int index=1;
        // int n=arr.size();
        // for(int i=1;i<n;i++){
        //     if(arr[i]!=arr[i-1]){
        //       arr[index++]=arr[i];
        //     }
        // }
        // return index;
        set<int>st;
        int n=arr.size();
        for(int i=0;i<n;i++){
            st.insert(arr[i]);

        }
        int k=st.size();
        int j=0;
        for(auto i :st){
            arr[j]=i;
            j++;
        }
        return j;

    }
};