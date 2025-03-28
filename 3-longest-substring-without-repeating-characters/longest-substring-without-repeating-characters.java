class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n=s.length();
        int max_len=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[256];
            for(int j=i;j<n;j++){
                if(freq[s.charAt(j)]==1){
                    break;
                }
                int len=j-i+1;
                max_len=Math.max(max_len,len);
                freq[s.charAt(j)]++;

            }
        }
        return max_len;
    }
}