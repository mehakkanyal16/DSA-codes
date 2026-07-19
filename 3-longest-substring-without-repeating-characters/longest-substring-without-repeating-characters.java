class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer>mp=new HashMap<>();
        int maxCnt=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(mp.containsKey(ch)&&mp.get(ch)>=left){
              left=mp.get(ch)+1;

            }
             maxCnt=Math.max(maxCnt,right-left+1);
             mp.put(ch,right) ;
        }
        return maxCnt;
        
    }
}