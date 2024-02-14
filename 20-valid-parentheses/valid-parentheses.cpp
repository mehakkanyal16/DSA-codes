class Solution {
public:
    bool isValid(string s) {
          stack<char> stakk;
        int i = 0;
        while (i < s.size()) {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                stakk.push(s[i]);
                i++;
            } else if (!stakk.empty() && s[i] == ')' && stakk.top() == '(') {
                stakk.pop();
                i++;
            } else if (!stakk.empty() && s[i] == ']' && stakk.top() == '[') {
                stakk.pop();
                i++;
            } else if (!stakk.empty() && s[i] == '}' && stakk.top() == '{') {
                stakk.pop();
                i++;
            } else {
                return false;
            }
        }
        return stakk.empty();
    }
        
    
};

  