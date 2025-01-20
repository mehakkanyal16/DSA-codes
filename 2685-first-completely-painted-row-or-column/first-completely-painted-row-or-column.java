class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        // Map to store the position of each element in the matrix
        Map<Integer, int[]> mp = new HashMap<>();
        
        // Fill the map with matrix elements and their positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = mat[i][j];
                // Check if the value is already in the map (to handle duplicates)
                if (!mp.containsKey(val)) {
                    mp.put(val, new int[]{i, j});
                }
            }
        }
        
        // Arrays to count occurrences of elements in rows and columns
        int[] rowCount = new int[n];
        int[] colCount = new int[m];
        
        // Iterate through arr to process each number
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            // Check if the number exists in the matrix (map lookup)
            int[] pos = mp.get(num);
            if (pos == null) continue; // Skip if number is not found in the matrix
            
            int row = pos[0];
            int col = pos[1];
            
            // Increment the row and column counts
            rowCount[row]++;
            colCount[col]++;
            
            // Check if the row or column is completely filled
            if (rowCount[row] == m || colCount[col] == n) {
                return i;
            }
        }
        
        return -1;  // Return -1 if no complete row or column is found
    }
}
