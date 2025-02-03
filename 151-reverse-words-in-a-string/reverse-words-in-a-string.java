class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        s=s.trim();
        String words[]=s.split("\\s+");
        for(int i=words.length-1;i>=0;i--){
             res=res.append(words[i]);
            if(i!=0){
                res=res.append(" ");
               
            }
        }
        return res.toString();
    }
}