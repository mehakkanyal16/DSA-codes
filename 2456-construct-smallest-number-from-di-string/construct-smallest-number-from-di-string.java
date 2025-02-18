class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder result=new StringBuilder();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<=pattern.length();i++){
            st.push(i+1);
            if(i==pattern.length()||pattern.charAt(i)=='I'){
                while(!st.isEmpty()){
                    result.append(st.pop());
                }
            }
        }
        return result.toString();
    }
}