class Solution {
    public String interpret(String command) {
        String ans="";
        for(int i=0;i<command.length();i++){
            char c=command.charAt(i);
            if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                ans=ans+'o';
                i++;
            }
        
        else if(command.charAt(i)=='('&&command.charAt(i+1)=='a'){
            ans=ans+"al";
            i=i+3;
        }
        else{
            ans=ans+c;
        }

    }

    return ans;
    }
}