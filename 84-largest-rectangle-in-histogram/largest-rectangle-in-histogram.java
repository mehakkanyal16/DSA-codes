class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer>st=new Stack<>();
        int maxArea=0;

        //left smaller element

       for(int i=0;i<n;i++){
         while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
            st.pop();
         }
         left[i]=st.isEmpty()?-1:st.peek();
         st.push(i);

       }

       st.clear();

       //right smaller element 
       for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() &&heights[st.peek()]>=heights[i]){
            st.pop();
        }
        right[i]=st.isEmpty()?n:st.peek();
        st.push(i);
       }
       //Maximize AREA:

       for(int i=0;i<heights.length;i++){
      int w=right[i]-left[i]-1;
      int b=heights[i];
      int area=w*b;
      maxArea=Math.max(maxArea,area);
       }
       return maxArea;




    }
    
}