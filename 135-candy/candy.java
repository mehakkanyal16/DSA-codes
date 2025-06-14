class Solution {
    public int candy(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        //left traversal 
        left[0]=1;
        for(int i=1;i<=n-1;i++){
           
            if(arr[i]>arr[i-1]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
            

        }
        //right traversal;
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                right[i]=right[i+1]+1;
            }else{
                 right[i]=1;

            }
           

        }
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=Math.max(left[i],right[i]);
            

        }
        return cnt;
    }
}