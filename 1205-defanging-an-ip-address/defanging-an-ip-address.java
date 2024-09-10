class Solution {
    public String defangIPaddr(String address) {
    String ans="";
    for(int i=0;i<address.length();i++){
        char c=address.charAt(i);
        if(c=='.'){
            ans=ans+"[.]";
        }
        else{
            ans=ans+c;
        }
    }
    return ans;
    }
}