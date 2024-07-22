class Solution {
    public int findKthPositive(int[] arr, int k) {
        // HashSet<Integer>set=new HashSet<>();
        // for(int x :arr){
        //     set.add(x);
        // }
        // int count=0;
        // int i=1;
        // while(true){
        //     if(!set.contains(i)){
        //         count++;
        //     }
        //     if(count==k){
        //         return i;
        //     }
        //     i++;
        // }

        int  n = arr.length;
        int low =0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int missing =arr[mid]-(mid+1);
            if(missing < k)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return high+1+k;
        
    }
}