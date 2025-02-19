class Solution {
    public int calculate(String s) {
        int res=0;
        int num=0;
       char sign='+';
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == s.length() - 1) {
             if(sign=='+'){
                // sign=1;
                
                st.push(num);
                // st.push(sign);
             
        
            }else if(sign=='-'){
                // sign=-1;
                st.push(-num);
                
                // st.push(sign);
                // num=0;
            }else if (sign=='*'){
                st.push(st.pop()*num);

                
            }
            else if(sign=='/'){
                st.push(st.pop()/num);

            }
            sign=c;
            num=0;

          }
        }

        while(!st.isEmpty()){
            res+=st.pop();
        }
      
        return res;

        
    }
}