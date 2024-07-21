class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};


        int start=0;
        int end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1};
            }
            else if(numbers[start]+numbers[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
        
    }
}