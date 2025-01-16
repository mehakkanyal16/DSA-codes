class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int len=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[255];
            for(int j=i;j<n;j++){
                if(freq[s.charAt(j)]==1){
                    break;
                }
                len=j-i+1;
                max=Math.max(max,len);
                freq[s.charAt(j)]+=1;
            }
        }
        return max;
    }
}