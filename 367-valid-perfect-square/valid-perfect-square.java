class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        for(int i=0;i<=Math.sqrt(num);i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
        
    }
}