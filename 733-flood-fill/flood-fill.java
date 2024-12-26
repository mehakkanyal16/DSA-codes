class Solution {
    public void dfs(int row,int col,int iniColor,int color,int[] drow,int[] dcol,int[][]ans,int[][] image){
        ans[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&ans[nrow][ncol]!=color&&image[nrow][ncol]==iniColor){
                ans[nrow][ncol]=color;
                dfs(nrow,ncol,iniColor,color,drow,dcol,ans,image);
            }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor=image[sr][sc];

     
        int[][] ans=image;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
         dfs(sr,sc,iniColor,color,drow,dcol,ans,image);
         return ans;

    }
}