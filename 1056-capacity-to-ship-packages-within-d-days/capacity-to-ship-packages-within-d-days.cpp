class Solution {
    private:
    int finddays(vector<int>&weights,int capacity){
        int days=1;
        int load=0;
        int n=weights.size();
        for(int i=0;i<n;i++){
            if(load+weights[i]>capacity){
                days=days+1;
                load=weights[i];
            }
            else{
                load=load+weights[i];
            }
        }
        return days;
    }
public:

    int shipWithinDays(vector<int>& weights, int days) {
        int maxi=*max_element(weights.begin(),weights.end());
        int sum=accumulate(weights.begin(),weights.end(),0);
       while(maxi<=sum){
           int mid=(maxi+sum)/2;
           int numberofdays=finddays(weights,mid);
           if(numberofdays<=days){
               sum=mid-1;
           }
           else{
               maxi=mid+1;

           }
       }
       return maxi;
    }
};