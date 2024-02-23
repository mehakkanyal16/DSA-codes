class Solution {
public:
    int firstUniqChar(string s) {
    //     int n = s.size();
    //     vector<int> arr(256, 0);
    //     for (auto i : s){
    //         arr[(int)i]++;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         if (arr[(int)s[i]] == 1) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    int n=s.size();
    for(int i=0;i<n;i++){
        bool appears_again=false;
        for(int j=0;j<n;j++){
            if(i!=j&&s[i]==s[j]){
                appears_again=true;
                break;
            }
        }
        if(!appears_again)return i;
    }
    return -1;
    }
};