class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int ind=0;
        Deque<Integer>dq=new LinkedList<>();
        for(int i=0;i<n;i++){
            // 
            while(!dq.isEmpty()&&dq.peek()<i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
                dq.pollLast();

            }
            dq.offer(i);
            if(i>=k-1){
                ans[ind++]=nums[dq.peekFirst()];
            }
        }
        return ans;
        
    }
}