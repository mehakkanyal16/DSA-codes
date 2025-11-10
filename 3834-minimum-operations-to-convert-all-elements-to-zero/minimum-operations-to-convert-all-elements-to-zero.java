class Solution {
    public int minOperations(int[] nums) {
       int op=0;
       Stack<Integer>st=new Stack<>();
       for(int num:nums){
        if(num==0){
            st.clear();
            continue;
        }
        while(!st.isEmpty()&&st.peek()>num){
            st.pop();
        }
        if(st.isEmpty()||st.peek()<num){
            st.push(num);
            op++;
        }
       }
       return op;
    }
}