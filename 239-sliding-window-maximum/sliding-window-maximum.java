class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int idx=0;
        Deque<Integer>dq=new LinkedList<>();
        int[] ans=new int[n-k+1];
       for(int i=0;i<n;i++){
        
         while(dq.size()>0&&dq.peek()<i-k+1){
            dq.poll();
         }
          while(dq.size()>0&&nums[dq.peekLast()]<nums[i]){
            dq.pollLast();
          }
          dq.add(i);
          if(i>=k-1){
            ans[idx++]=nums[dq.peek()];
          }
       }
   return ans;
        
    }
}