class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
     
        for(int num:asteroids){
            if(num>0){
                st.push(num);
            }
            else {
                // int last=st.pop();
                // int neg=Math.abs(num);
                // if(neg>last){
                //     st.push(neg);
                // }
                // else if(last>neg){
                //     st.push(last);
                // }

                // if one positive and one negative
              while(!st.isEmpty()&&st.peek()>0&&st.peek()<Math.abs(num)){
                   st.pop();
                }
                if(st.isEmpty()||st.peek()<0){
                    st.push(num);
                }
                else if(st.peek()==Math.abs(num)){
                    st.pop();
                }
                
            }
        }
         int[] result=new int[st.size()];
            for(int i=result.length-1;i>=0;i--){
                result[i]=st.pop();
            }
        
        return result;
        
        
    }
}