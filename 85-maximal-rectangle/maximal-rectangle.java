class Solution {

    
    public int maximalRectangle(char[][] matrix) {


        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int maxArea=0;
        int cols=matrix[0].length;
        int[] heights=new int[cols];

        for(char[] row:matrix){
            for(int i=0;i<cols;i++){
                heights[i]=(row[i]=='1')?heights[i]+1:0;
            }
            maxArea=Math.max(maxArea,largestRectangleArea(heights));
            
        }
        return maxArea;

        
    }
        public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int[] left=new int[n];
        int[] right=new int[n];

        int maxArea=0;

       //left smaller element :
       for(int i=0;i<n;i++){
        while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
            st.pop();
        }
        left[i]=st.isEmpty()?-1:st.peek();
        st.push(i);
       }
       st.clear();
       //right smaller element: 
       for(int i=n-1;i>=0;i--){
         while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
            st.pop();
         }
         right[i]=st.isEmpty()?n:st.peek();
         st.push(i);
       }
       for(int i=0;i<n;i++){
        int w=right[i]-left[i]-1;
        int h=heights[i];
        int area=w*h;
        maxArea=Math.max(maxArea,area);
       }

       return maxArea;
    
    }
}