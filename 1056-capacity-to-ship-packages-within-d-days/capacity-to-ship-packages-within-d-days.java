class Solution {
    public int totalSum(int[] weights){
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum; 
    }
    public int requiredDays(int[] wt, int cap){
        int days=1;
        int load=0;
        int n=wt.length;
        for(int i=0;i<n ;i++ ){
            if(load+wt[i]>cap){
                days=days+1;
                load=wt[i];
            }else{
                load=load+wt[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi=Integer.MIN_VALUE;
        for(int num:weights){
            maxi=Math.max(num,maxi);
        }
        int maxCapacity=totalSum(weights);

        // //max -> maxcapacity  (range)
        //  int daysReq=0;
        // for(int i=maxi;i<=maxCapacity;i++){
        //     daysReq=requiredDays(weights,i);
        //     if(daysReq<=days){
        //         return i;
        //     }
        // }
        // return -1;

        int start=maxi;
        int end=maxCapacity;
        while(start<end){
           int mid = start + (end - start) / 2;
            int daysReq=requiredDays(weights,mid);
            if(daysReq<=days){
               end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;


    }
}