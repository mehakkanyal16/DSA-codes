class Solution {
public:
    int percentageLetter(string s, char letter) {
        int count=0;
        for(int i=0;i<s.size();i++){
            if(s[i]==letter){
                count++;
            }
        }
        double c= ((double)count/s.size())*100;
        return c;
    }
};