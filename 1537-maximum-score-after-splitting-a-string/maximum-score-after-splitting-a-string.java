class Solution {
    public int maxScore(String s) {
        int total_1=0;
        int right_1=0;
        int left_0=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                total_1++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                left_0++;
            }else{
                right_1++;
            }
            max=Math.max(max,left_0+(total_1-right_1));
        }
        return max;
    }
}