class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] v = new int[n + 1];  // Create an array to store shift operations
        
        // Process each shift operation
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];
            
            if (dir == 0) {  // Left shift
                v[start] -= 1;  // Decrease the shift at the start index
                if (end + 1 < n) {
                    v[end + 1] += 1;  // Reset the shift after the end index
                }
            } else {  // Right shift
                v[start] += 1;  // Increase the shift at the start index
                if (end + 1 < n) {
                    v[end + 1] -= 1;  // Reset the shift after the end index
                }
            }
        }

        // Accumulate the shifts for each position
        for (int i = 1; i < n; i++) {
            v[i] += v[i - 1];  // Compute the cumulative sum of shifts
        }

        // Apply the shifts to the string
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            char currentChar = result.charAt(i);
            int originalIndex = currentChar - 'a';  // Convert char to index (0 to 25)
            int newIndex = (originalIndex + v[i]) % 26;  // Apply shift and wrap with modulo 26

            if (newIndex < 0) {
                newIndex += 26;  // Handle negative shift results for left shifts
            }

            result.setCharAt(i, (char) ('a' + newIndex));  // Set the new character
        }

        return result.toString();  // Return the shifted string
    }
}
