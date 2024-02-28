class Solution {
public:
  vector<string>v;
    void solve(int i , int j , int n , string s) {
        if(i == n and j == n) {
            v.push_back(s);
            return;
        }
        if(i < n) solve(i + 1 , j , n , s + '(');
        if(j < i) solve(i  , j + 1 , n , s + ')');

    }

    vector<string> generateParenthesis(int n) {
           solve(0, 0 , n , "");
        return v;
    }
    
};