class Solution {
    public int calculate(String s) {
        int res=0;
        int num=0;
        int sign=1;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');

            }else if(c=='+'){
                res+=num*sign;
                num=0;
                sign=1;
            }
            else if(c=='-'){
                res+=num*sign;
                num=0;
                sign=-1;
            }else if(c=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;

            }else if(c==')'){
                res+=num*sign;
                num=0;
                res*=st.pop();
                res+=st.pop();

                
            }
        }
        res+=num*sign;
        return res;
        
    }
}