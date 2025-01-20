class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        HashMap<Integer, int[]> mp = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int num = mat[i][j];
                if (!mp.containsKey(num)) {
                    mp.put(num, new int[] { i, j });
                }
            }
        }
        int[] rowCount = new int[n];
        int[] colCount = new int[m];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int[] pos = mp.get(num);
            if (pos.length==0) continue;
            int row = pos[0];
            int col = pos[1];
            rowCount[row]++;
            colCount[col]++;
            if (rowCount[row] == m || colCount[col] == n) {
                return i;
            }
        }
        return -1;
    }
}