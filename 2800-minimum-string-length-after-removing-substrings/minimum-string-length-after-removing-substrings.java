class Solution {
    public int minLength(String s) {
     Stack<Character>st=new Stack<>();
     for(int i=0;i<s.length();i++){
        char curr=s.charAt(i);
        if(st.isEmpty()){
            st.push(curr);
            continue;
        }
        if(curr=='B'&&st.peek()=='A'){
            st.pop();
        }
        else if(curr=='D'&&st.peek()=='C'){
            st.pop();
        }
        else{
            st.push(curr);
        }
     }
     return st.size();
        
    }
}