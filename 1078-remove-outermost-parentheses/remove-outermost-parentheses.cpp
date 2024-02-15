class Solution {
public:
    string removeOuterParentheses(string s) {
        // string res="";
        // int count=0;
        // int n=s.size();
        // for(int i=0;i<n;i++){
        //     if(s[i]=='('){
        //         count++;
        //     }
        //     else{
        //         count--;
        //     }
        //       if((count==1&&s[i]=='('||count==0&&s[i]==')')){
        //     continue;
        // }
        // else{
        //     res=res+s[i];
        // }

        // }
        // return res;
         string res;
        int opened = 0;
        for (char c : s) {
            if (c == '(' && opened++ > 0) res += c;
            if (c == ')' && opened-- > 1) res += c;
        }
        return res;
      
    }
};