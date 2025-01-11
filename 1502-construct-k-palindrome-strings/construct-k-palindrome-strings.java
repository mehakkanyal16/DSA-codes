class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)return false;
        if(s.length()==k)return true;
        int[] freq=new int[26];
        int odd_count=0;
        for(char c:s.toCharArray()){
        freq[c-'a']++;
        }
        for(int count:freq){
            if(count%2!=0){
                odd_count++;
            }
        }
        if(odd_count<=k)return true;
        else return false;
    }
}