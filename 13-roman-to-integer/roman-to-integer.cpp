// class Solution {
// public:
//     int romanToInt(string s) {
//         unordered_map<char,int>m;
//         m['I']=1;
//         m['V']=5;
//         m['X']=10;
//         m['L']=50;
//         m['C']=100;
//         m['D']=500;
//         m['M']=1000;
//         int ans=0;
//         for(int i=0;i<s.length();i++){
//             if(m[s[i]]<m[s[i+1]]){
//                 ans=ans-m[s[i]];
//             }
//             else{
//                 ans=ans+m[s[i]];
//             }
//         }
//         return ans;
//     }
// };
class Solution{
    public:
    int romanToInt(string s){
        int i=0;
        int value=0;
        unordered_map<char,int>m;
        m['I']=1;
        m['V']=5;
        m['X']=10;
        m['L']=50;
        m['C']=100;
        m['D']=500;
        m['M']=1000;
        while(i<s.length()){
        if(i<s.length()-1&&m[s[i]]<m[s[i+1]]){
            value=value+m[s[i+1]]-m[s[i]];
            i=i+2;
        }
        else{
            value=value+m[s[i]];
            i=i+1;
        }
        }
return value;

    }
};