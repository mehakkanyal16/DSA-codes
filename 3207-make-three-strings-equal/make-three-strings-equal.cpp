class Solution {
public:
    int findMinimumOperations(string s1, string s2, string s3) {
                int minlen=min(s1.size(),min(s2.size(),s3.size()));
        int mx=0;
        if(s1[0]!=s2[0]||s2[0]!=s3[0]||s3[0]!=s1[0]){
            return -1;
        }
        int c=0;
        for(int i=0;i<minlen;i++){
            if(s1[i]==s2[i] && s2[i]==s3[i] && s3[i]==s1[i]){
                c++;
            }
            else{
                break;
            }
        }
        // cout<<max(mx,c)<<endl;
        return s1.size()+s2.size()+s3.size()-3*c;
    
    }
};