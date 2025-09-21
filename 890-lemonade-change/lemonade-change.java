class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fCnt=0;
        int tenCnt=0;
        int tWCnt=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fCnt++;
            }
            else if(bills[i]==10){
               if(fCnt>0){
                fCnt--;
                tenCnt++;
               }else{
                return false;
               }
            }
            else {
                if(tenCnt>0&&fCnt>0){
                    tenCnt--;
                    fCnt--;
                }
                else if(fCnt>=3){
                    fCnt=fCnt-3;
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}