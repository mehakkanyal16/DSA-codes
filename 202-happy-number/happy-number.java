class Solution {
    public int findSquare(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans+rem*rem;
            n=n/10;
            
        }
        return ans;

    }
    public boolean isHappy(int n) {
        int slow=n;// for one step ahead
        int fast=n;// for two steps ahead
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
        
    }
}