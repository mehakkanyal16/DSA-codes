class Solution {
    public String removeOuterParentheses(String s) {
     String res="";
     int opened=0;
     for(char ch :s.toCharArray()){
        if(ch=='('&&opened++>0)res+=ch;
        if(ch==')'&&opened-->1)res+=ch;
     }
       
       return res;
    }
}