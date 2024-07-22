class Solution {
    public  void swap(String[] names,int[] heights,int i ,int j){
        String tempName=names[i];
        int tempHeight=heights[i];
        names[i]=names[j];
        heights[i]=heights[j];
        names[j]=tempName;
        heights[j]=tempHeight;
    }
    public String[] sortPeople(String[] names, int[] heights) {
          for(int i=0;i<names.length;i++){
            int maxIndex=i;
           for(int j=i+1;j<names.length;j++){
                 if(heights[j]>heights[maxIndex]){
                   maxIndex=j;
                  }
           }
           swap(names,heights,i,maxIndex);
        }
        return names;
        
    }
}