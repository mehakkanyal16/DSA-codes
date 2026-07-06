class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int maxC=0;
        for(char ch :s.toCharArray()){
            if(ch=='('){
            cnt++;
            maxC=Math.max(maxC,cnt);
            }else if(ch==')'){
                cnt--;

            }
        }
        return maxC;
        
    }
}