class Solution {
    public int reverse(int x){
        int reverse=0;
        while(x!=0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        return reverse;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original=x;
        int rev=reverse(x);
   
        return original==rev;
        
    }
}