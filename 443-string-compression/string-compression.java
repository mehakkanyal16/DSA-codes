class Solution {
    public int compress(char[] chars) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                compressed.append(chars[i]);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        // Copy the compressed result back to the original array
        for (int i = 0; i < compressed.length(); i++) {
            chars[i] = compressed.charAt(i);
        }

        return compressed.length();
    }
}
