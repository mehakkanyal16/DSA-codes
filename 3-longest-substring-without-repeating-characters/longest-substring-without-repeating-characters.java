class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int max_len=0;

        
        for(int i=0;i<s.length();i++){
            int freq[] =new int[255];
            for(int j=i;j<s.length();j++){
                if(freq[s.charAt(j)]==1){
                    break;
                }
                len=j-i+1;
                max_len=Math.max(max_len,len);
                freq[s.charAt(j)]++;


            }

        }
        return max_len;
    }
}