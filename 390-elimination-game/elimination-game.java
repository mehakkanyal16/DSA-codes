class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int step=1;
        boolean leftToRight=true;
        while(n>1){
            if(leftToRight||n%2==1){
                head+=step;
            }
            step*=2;
            n/=2;
            leftToRight=!leftToRight;

        }
        return head;
    }
}