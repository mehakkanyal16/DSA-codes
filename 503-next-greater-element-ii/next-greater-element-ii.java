class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int[] result=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            result[i]=-1;
        }

        for (int i=0;i<2*n;i++){
            int ind=i%n;
            while(!st.isEmpty()&&nums[ind]>nums[st.peek()]){
                result[st.pop()]=nums[ind];
            }
            if(i<n){
                st.push(ind);
            }
        }
        return result;
        
    }
}