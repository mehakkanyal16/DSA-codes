class Solution {
    public String minWindow(String s, String t) {
        int left=0;
        int right=0;
        int sIndex=-1;
        int count=0;
        int min_len=Integer.MAX_VALUE;
        int[] hash=new int[256];
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }
        while(right<s.length()){
            if(hash[s.charAt(right)]>0){
                count++;
              
            }
               hash[s.charAt(right)]--;
            while(count==t.length()){
                if((right-left+1)<min_len){
                    min_len=right-left+1;
                    sIndex=left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0){
                    count--;
                }
                left++;

            }
            right++;
      
        }
        return sIndex==-1?"":s.substring(sIndex,sIndex+min_len);
        
    }
}