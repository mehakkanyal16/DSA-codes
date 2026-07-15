class Solution {
    public long minHelper(int[] arr){
        Stack<Integer>st=new Stack<>();

        int n=arr.length;
        int[] left=new int[n];
        int [] right=new int[n];

        //left
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i]=i+1;
            }else{
                left[i]=i-st.peek();
            }

            st.push(i);

        }
        st.clear();

        // right
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i]=n-i;
            }else{
                right[i]=st.peek()-i;
            }

            st.push(i);

        }

        long ans = 0;
        

        for (int i = 0; i < n; i++) {
        long contribution = (1L * arr[i] * left[i] * right[i]) ;
        ans = (ans + contribution) ;
        }

       return ans;
    }


    public long maxHelper(int[] arr){
        Stack<Integer>st=new Stack<>();

        int n=arr.length;
        int[] left=new int[n];
        int [] right=new int[n];

        //left
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i]=i+1;
            }else{
                left[i]=i-st.peek();
            }

            st.push(i);

        }

        st.clear();

        // right
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i]=n-i;
            }else{
                right[i]=st.peek()-i;
            }

            st.push(i);

        }

        long ans = 0;
        

        for (int i = 0; i < n; i++) {
        long contribution = (1L * arr[i] * left[i] * right[i]) ;
        ans = (ans + contribution) ;
        }

       return ans;
    }

    public long subArrayRanges(int[] arr) {
        
        //sum of subarray ranges= sum of max in subarray-sum of min in subarray

        long max=maxHelper(arr);
        long min=minHelper(arr);
        return max-min;


        
    }
}