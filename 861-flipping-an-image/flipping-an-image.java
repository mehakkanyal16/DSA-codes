class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int start=0;
            int end=image[0].length-1;
            while(start<=end){
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                start++;
                end--;
                
            }
        }
         for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                image[i][j]=image[i][j]^1;
            }
         }
         return image;
    }
}