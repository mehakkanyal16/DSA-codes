class Solution {
    public int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE;
        int s=0;
        int e=height.length-1;
        while(s<e){
            int area=(e-s)*Math.min(height[s],height[e]);
            maxArea=Math.max(area,maxArea);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--; 
            }
                
        }
   return maxArea;
        
    }
}