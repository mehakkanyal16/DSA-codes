class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int left=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
     
            if(mp.containsKey(c)&&mp.get(c)>=left){
                left=mp.get(c)+1;

            }
            maxLen=Math.max(maxLen,right-left+1);
            mp.put(c,right);

        }
        return maxLen;

        
    }
}