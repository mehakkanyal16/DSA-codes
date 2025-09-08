class Solution {
    public boolean isContainsZero(int n){
        while(n>0){
            int digit=n%10;
            if(digit==0)return true;
            n=n/10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n;i++){
            int a=i;
            int b=n-i;
            if(a>0 && b>0 && isContainsZero(a)==false && isContainsZero(b)==false ){
                return new int[]{a,b};
            }
        }
        return new int[]{-1,-1};
        
    }
}