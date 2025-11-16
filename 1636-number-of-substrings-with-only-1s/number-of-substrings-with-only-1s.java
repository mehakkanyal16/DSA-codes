class Solution {
    public int numSub(String s) {
        long total=0;
        long cnt=0;
        long mod=1000000007;
        for(char ch :s.toCharArray()){
            if(ch=='1'){
                cnt++;
            }else{
                cnt=0;
            }
            total=(total+cnt)%mod;
        }
        return (int)total;
        
    }
}