class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int maxLen=0;
        int maxfreq=0;
        int[] hash=new int[126];

        for(int right=0;right<n;right++){
            hash[s.charAt(right)-'A']++;
            maxfreq=Math.max(hash[s.charAt(right)-'A'],maxfreq);
            while((right-left+1)-maxfreq>k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(right-left+1,maxLen);

        }
        return maxLen;
    }
}