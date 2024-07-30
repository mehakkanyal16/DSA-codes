class Solution {
    public int minimumDeletions(String s) {
       int ans=0;
       int count_b=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='b'){
            count_b++;
        }
        else{
            ans=Math.min(ans+1,count_b);
        }
       }
       return ans;
        
    }
}