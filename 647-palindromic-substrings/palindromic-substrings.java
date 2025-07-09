public class Solution {
    private int count = 0;
    public int countSubstrings(String s) {
        if (s.length()==0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            help(s, i, i); 
            help(s, i, i + 1);
        }
        return count;
    }
    private void help(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}