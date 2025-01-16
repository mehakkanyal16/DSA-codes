class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len=0;
        int left=0;
        Map<Character,Integer>mp=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(mp.containsKey(c)&&mp.get(c)>=left){
                left=mp.get(c)+1;
            }
            max_len=Math.max(max_len,right-left+1);
            mp.put(c,right);
        }
        return max_len;
    }
}