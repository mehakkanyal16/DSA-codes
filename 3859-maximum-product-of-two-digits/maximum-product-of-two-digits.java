class Solution {
    public int maxProduct(int n) {
        int maxProd=1;
        int first=0;
        int second=0;

        while(n>0){
            int x=n%10;
            if(x>first){
                second=first;
                first=x;
            }else if(x>second){
                second=x;
            }
            n=n/10;
            

        }
        maxProd=first*second;
        return maxProd;

        
    }
}