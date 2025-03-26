class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int maxLen=0;
       int right=0;
       int left=0;
       while(right<s.length()){
        char c=s.charAt(right);
        if(mp.containsKey(c)){
            left = Math.max(left, mp.get(c) + 1);
        }
        mp.put(c,right);
        maxLen=Math.max(maxLen,right-left+1);
        right++;
       }
       return maxLen;
        
    }
}