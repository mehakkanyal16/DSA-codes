class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
   private void bfs(int ro, int co, int[][] vis, char[][] grid) {
        vis[ro][co] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;

        // Directions for up, right, down, left
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            Pair current = q.poll();
            int row = current.first;
            int col = current.second;

            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
         int n=grid.length;
         int m=grid[0].length;
         int[][] vis=new int[n][m];
         int count=0;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]=='1'){
                    bfs(i,j,vis,grid);
                    count++;
                }
            }
         }
         return count;

    }
}