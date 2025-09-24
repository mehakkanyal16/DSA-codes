class Solution {
    public int lengthOfLongestSubstring(String s) {
      
       if(s.length()==0){
        return 0;
       }
        HashMap<Character,Integer>mp=new HashMap<>(); //to store character & its index;
        int maxCount=0; //count of longest substring 
        int left=0 ;  //window pointers;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(mp.containsKey(ch)&&mp.get(ch)>=left){
                left=mp.get(ch)+1;
            }
            maxCount=Math.max(maxCount,right-left+1);
            mp.put(ch,right) ;
        }
        return maxCount;
    

        
    }
}