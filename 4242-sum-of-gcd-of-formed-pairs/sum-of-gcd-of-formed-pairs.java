class Solution {
    public int gcd(int a, int b){
        while(b!=0){
           int temp = b;  
            b = a % b;    
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {

        long ans=0;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int[] prefixGcd=new int[n];
         for(int i = 0 ; i<n ; i++ ){
            maxi=Math.max(nums[i],maxi);
            prefixGcd[i]=gcd(nums[i],maxi);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=n-1;
        while(i<j){
            ans+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return ans;
    }
}