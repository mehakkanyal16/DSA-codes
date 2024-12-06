class pair{
    int row;
    int col;
    int t;
    public pair(int row,int col,int t){
        this.row=row;
        this.col=col;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair>q=new LinkedList<>();
        int[][] vis=new int[n][m];


        int tm=0;
        int cnt=0;
        int cntFresh=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;

                }
                if(grid[i][j]==1){
                    cntFresh++;
                }
            }
        }
     

        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().t;
            tm=Math.max(tm,t);
            q.remove();
            int[] drow={-1,0,1,0};
            int[] dcol={0,1,0,-1};
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=00&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]==1&&vis[nrow][ncol]==0){
                    q.add(new pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=1;
                    cnt++;

                }

            }
        }
        if(cnt!=cntFresh){
            return -1;
        }
        return tm;

    }
}