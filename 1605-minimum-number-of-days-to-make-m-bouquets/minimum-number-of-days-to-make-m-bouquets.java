class Solution {
    public boolean isPossible(int[] bloomDay, int day , int m , int k){
          int cnt=0;
          int bouquets=0;
          for(int bloom:bloomDay){
            if(bloom<=day){
                //flower is ready to bloom:
             cnt++;
             if(cnt ==k){
                bouquets++;
                cnt=0;
             }
            }else{
                cnt=0;
            }

          }

          return bouquets >= m; // check if required bouquets can be made


    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        // Find the minimum and maximum bloom day
        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }
        int start=minDay;
        int end=maxDay;
        int ans=-1;
       if (m * k > n) {
    return -1;
}
        while(start<=end){
            int mid =end+(start-end)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;

        
        
    }
}