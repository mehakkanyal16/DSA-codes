class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character>st=new Stack<>();
        for(char ch :s.toCharArray()){
            while(!st.isEmpty()&&st.peek()>ch&&k>0){
                st.pop();
                k--;
            }
            st.push(ch);
            
        }
        while(k>0){
            st.pop();
            k--;
        }

        //build the ressult Stack:
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        // remove trailling zeroes :
        while(sb.length()>0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()>0 ?sb.toString():"0";
    }
}