class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);
            }
            else{
                if(ch==')'){
                    if(st.empty()||st.pop()!='('){
                        return false;
                    }



                }
                  if(ch=='}'){
                     if(st.empty()||st.pop()!='{'){
                        return false;
                    }
                    
                }
                  if(ch==']'){
                    
                     if(st.empty()||st.pop()!='['){
                        return false;
                    }
                }
            }

        }
        return st.empty();
        
    }
}