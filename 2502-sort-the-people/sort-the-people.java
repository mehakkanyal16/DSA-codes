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
        //   for(int i=0;i<names.length;i++){
        //     int maxIndex=i;
        //    for(int j=i+1;j<names.length;j++){
        //          if(heights[j]>heights[maxIndex]){
        //            maxIndex=j;
        //           }
        //    }
        //    swap(names,heights,i,maxIndex);
        // }
        // return names;


        Map<Integer , String > map = new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i] , names[i]); // putting it in a hashmap
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length]; //create new array of the length of hashmap
        int index = 0;
        for(int i=heights.length-1;i>=0;i--){ // reverse loop beacuse the result of arrays.sort will be in smaller to greater but we want greater to smaller
            result[index]= map.get(heights[i]); //putting result in the new array
            index++;
        }
        return result;
        
    }
}