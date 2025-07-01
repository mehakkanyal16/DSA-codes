class Solution {
    public int possibleStringCount(String s) {
        if(s.length()==0)return 0;
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
        }
        return cnt;
        
    }
}