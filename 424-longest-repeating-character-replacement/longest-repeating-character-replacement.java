class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int max_len = 0;
        int maxf = 0; // To keep track of the most frequent character in the window
        int[] hash = new int[26];

        for (int r = 0; r < s.length(); r++) {
            hash[s.charAt(r) - 'A']++; // Increment the frequency of the character at 'r'
            maxf = Math.max(maxf, hash[s.charAt(r) - 'A']); // Update the max frequency

            // If the window size minus the max frequency exceeds 'k', shrink the window
            while ((r - l + 1) - maxf > k) {
                hash[s.charAt(l) - 'A']--; // Decrease the frequency of the character at 'l'
                l++; // Shrink the window from the left
            }

            // Update the maximum length of the window
            max_len = Math.max(max_len, r - l + 1);
        }

        return max_len;
    }
}
