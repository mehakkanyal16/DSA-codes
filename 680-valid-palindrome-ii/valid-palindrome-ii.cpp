class Solution {
public:
    bool validPalindrome(string s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s[left]!=s[right]){
                if(ispalindrome(s,left+1,right)){
                    return true;
                }
                    if(ispalindrome(s,left,right-1)){
                        return true;
                    }
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
private:
    bool ispalindrome(string s,int start,int end){
        while(start<end){
            if(s[start]!=s[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }    
};