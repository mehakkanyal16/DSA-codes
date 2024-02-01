class Solution {
public:
int binarysearch(int n){
    int start=0;
    int end=n;
    int ans=-1;
    while(start<=end){
        long long int mid=start+(end-start)/2;
       long long int sq=mid*mid;
        if(sq==n){
            return mid;
        }
        else if(sq<n){
            ans=mid;
            start=mid+1;
            
        }
        else{
         end=mid-1;
        }
    }
    return ans;
}
    int mySqrt(int x) {
        int c=binarysearch(x);
        return c;
        
    }
};