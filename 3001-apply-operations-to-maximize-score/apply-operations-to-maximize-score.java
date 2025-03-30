class Solution {
    long mod = (long)1e9+7;
    public int maximumScore(List<Integer> nums, int k) {
        int n = nums.size();
        int score[] = new int[n];

        for(int i=0;i<n;i++){
            int val = nums.get(i);
            for(int j=2;j*j<=val;j++){
                if(val%j==0)    score[i]++;
                while(val%j==0){
                    val/=j;
                }
            }
            if(val>1)   score[i]++;
        }

        int left[] = new int[n];
        int right[] = new int[n];
        
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && score[st.peek()]<score[i])   st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && score[st.peek()]<=score[i])  st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->o2[0]-o1[0]);
        for(int i=0;i<n;i++){
            pq.add(new int[]{nums.get(i),i});
        }

        long ans = 1;
        while(!pq.isEmpty() && k>0){
            int pop[] = pq.remove();
            int val = pop[0], idx = pop[1];

            long subarray = 1l*(idx-left[idx])*(right[idx]-idx);

            long temp = Math.min(subarray,k);
            k-=temp;
            
            ans = (ans%mod * superpow(val+0l,temp)%mod)%mod;
        }

        return (int)ans;
    }
    long superpow(long a,long b){
        if(b==0)    return 1;
        if(b%2==1)  return (a%mod * superpow(a,b-1)%mod)%mod;
        return  superpow( (a%mod * a%mod)%mod,b/2);
    }
}