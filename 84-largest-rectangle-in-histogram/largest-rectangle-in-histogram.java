class Solution {
    public int[] nextSmallerElement(int[] h ,int n){
        int[] ans=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int i=n-1;i>=0;i--){
            int curr=h[i];
            while(st.peek()!=-1&&h[st.peek()]>=curr){
               st.pop(); 

            }
            ans[i]=st.peek();
            st.push(i);


        }
        return ans;

    }
    public int[] prevSmallerElement(int[] h,int n){
         int[] ans=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int i=0;i<n;i++){
            int curr=h[i];
            while(st.peek()!=-1&&h[st.peek()]>=curr){
               st.pop(); 

            }
            ans[i]=st.peek();
            st.push(i);


        }
        return ans;

    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] next=new int[n];
        next=nextSmallerElement(heights,n);
        int[] prev=new int[n];
        prev=prevSmallerElement(heights,n);
        int area=0;
        for(int i=0;i<n;i++){
            int l=heights[i];
            if(next[i]==-1){
                next[i]=n;
            }
            int b=next[i]-prev[i]-1;
            int newArea=l*b;
            area=Math.max(area,newArea);

        }
        return area;

        
    }
}