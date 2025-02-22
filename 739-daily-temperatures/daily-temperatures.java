class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>st=new Stack<>();
        int[] res=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty()&&temp[i]>temp[st.peek()]){
                int prevIndex=st.pop();
                res[prevIndex]=i-prevIndex;

            }
            st.push(i);
        }
        return res;
        
    }
}