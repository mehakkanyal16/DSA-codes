class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        int i=0;
        while(i<len1&&i<len2){
            ans=ans.append(word1.charAt(i));
            ans=ans.append(word2.charAt(i));
            i++;
        }
        if(i<len1){
            ans=ans.append(word1.substring(i));
        }
          if(i<len2){
            ans=ans.append(word2.substring(i));
        }
        return ans.toString();
    }
}