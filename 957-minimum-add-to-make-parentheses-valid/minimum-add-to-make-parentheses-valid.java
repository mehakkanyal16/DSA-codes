class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!st.empty()&&st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
        
    }
}