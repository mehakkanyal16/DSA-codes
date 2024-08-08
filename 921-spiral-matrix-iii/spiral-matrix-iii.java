class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
               int[][] ans = new int[rows*cols][2];

        int[][] directions ={ {0,1},   // East 
                              {1,0},   // South   
                              {0,-1},  // West
                              {-1,0}  // North
                            };

    
    int index = 0;
    ans[index] = new int[] {rStart,cStart};  
    index++;

    int steps = 0;
    int dir   = 0;
    while(index < rows*cols){
        if(dir == 0 || dir == 2){
            steps++;
        }
            for(int i = 0 ; i < steps ; i++){
                rStart += directions[dir][0];
                cStart += directions[dir][1];

                if(rStart >= 0 && rStart < rows && cStart >=0 && cStart < cols){  // valid cell
                    ans[index] = new int[] {rStart,cStart};
                    index++;
                }
            }

            dir = (dir + 1) % 4;
        
    }

    return ans;
    }
}