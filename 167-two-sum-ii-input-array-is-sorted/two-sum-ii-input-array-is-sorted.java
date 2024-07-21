class Solution {
    private int binarySearch(int[] numbers,int target,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(numbers[m]==target){
                return m;
            }
            else if(target>numbers[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {

    //   linear search

        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};



        // two pointers approach

        // int start=0;
        // int end=numbers.length-1;
        // while(start<end){
        //     if(numbers[start]+numbers[end]==target){
        //         return new int[]{start+1,end+1};
        //     }
        //     else if(numbers[start]+numbers[end]<target){
        //         start++;
        //     }
        //     else{
        //         end--;
        //     }
        // }
        // return new int[]{-1,-1};

        //   binary search

        for(int i=0;i<numbers.length;i++){
            int temp=target-numbers[i];
            int index=binarySearch(numbers,temp,i+1,numbers.length-1);
            if(index!=-1){
                return new int[]{i+1,index+1};
            }

        }

         return new int[]{-1,-1};
        
    }
}