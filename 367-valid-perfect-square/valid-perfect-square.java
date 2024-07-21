class Solution {
    public boolean isPerfectSquare(int num) {

         return (int)Math.sqrt(num) * (int)Math.sqrt(num) == num ? true : false; 

     //  time complexity O(n);

         // if(num==1){
        //     return true;
        // }
        // for(int i=0;i<num;i++){
        //     if(i*i==num){
        //         return true;
        //     }
        // }
        // return false;
   
//   time complexity O(sqrt(n));
        // if(num==1){
        //     return true;
        // }
        // for(int i=0;i<=Math.sqrt(num);i++){
        //     if(i*i==num){
        //         return true;
        //     }
        // }
        // return false;


        // // binary search
        // time complexity O(logn)

    // if(num<2){
    // return true;
    //  }
    // int start=1;
    // int end=(int)Math.sqrt(num);
    //  while(start<=end){
    //    int mid=start+(end-start)/2;
    //     if(mid*mid==num){
    //         return true;
    //     }
    //     else if(mid*mid<num){
    //         start=mid+1;
    //     }
    //     else{
    //         end=mid-1;
    //     }
    //  }
    //  return false;
        
    }
}