class Solution {
    public int numberOfSubstrings(String s) {
        int left=0;
        int n=s.length();
        int[] freq=new int[3];
        int cnt=0;
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0&&freq[1]>0&&freq[2]>0){
                cnt+=n-right;
                freq[s.charAt(left) - 'a']--; // Shrink window from the left
                left++;
            }
        }
        return cnt;
    }
}