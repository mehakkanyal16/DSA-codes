class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0, count = 0;
        int[] freq = new int[3]; // To store the frequency of 'a', 'b', 'c'

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++; // Increment frequency of current character

            // If all three characters are present in the window
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right; // Count all valid substrings
                freq[s.charAt(left) - 'a']--; // Shrink window from the left
                left++;
            }
        }
        return count;
    }
}
