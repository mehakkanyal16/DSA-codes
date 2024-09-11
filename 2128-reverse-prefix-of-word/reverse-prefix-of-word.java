class Solution {
    public String stringReversal(String s){
    
     String reversedStr = "";
      for (int i = 0; i <s.length(); i++) {
      reversedStr = s.charAt(i) + reversedStr;
    }
    return reversedStr;
    
    }
    public String reversePrefix(String word, char ch) {
         String ans="";
         int index=-1;
         for(int i=0;i<word.length();i++){
          if(word.charAt(i)==ch){
            index=i;
            break;
          }
         }
         if(index==-1){
            return word;
         }
        String prefix=word.substring(0,index+1);
        ans=stringReversal(prefix);
        ans=ans+word.substring(index+1);
       return ans;

    }
}