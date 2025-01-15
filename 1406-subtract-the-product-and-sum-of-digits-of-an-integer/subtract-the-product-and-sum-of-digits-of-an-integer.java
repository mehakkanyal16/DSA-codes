class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        while(n!=0){
            int last=n%10;
            pro=pro*last;
            sum=sum+last;
            n=n/10;
        }
        return pro-sum;
    }
}