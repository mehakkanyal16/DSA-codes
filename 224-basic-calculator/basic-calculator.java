class Solution {
    public int calculate(String s) {
        int res=0;
        int num = 0;//used to convert number to digit;
        int sign = 1; 
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
      
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
                

            }else if(c=='+'){
                res+=sign*num;
                num=0;
                sign=1;
            }else if(c=='-'){
                res+=sign*num;
                num=0;
                sign=-1; 
            }else if(c=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;

            }else if(c==')'){
                res += sign * num;
                num = 0;
                res *= st.pop(); // Pop the sign
                res += st.pop(); // Pop the result


            }
     
   

        }
         res+=sign*num;
        return res;

        
    }
}