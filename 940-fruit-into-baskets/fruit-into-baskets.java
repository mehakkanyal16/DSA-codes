class Solution {
    public int totalFruit(int[] fruits) {
     int left=0;
     int right=0;
     int max_len=0;
     int uniqueFruits=0;
     int[] freq=new int[fruits.length];
     while(right<fruits.length){
         if (freq[fruits[right]] == 0) {
                uniqueFruits++; // A new fruit type is added to the window
            }
            freq[fruits[right]]++;
          if(uniqueFruits>2){
           while(uniqueFruits>2){
               freq[fruits[left]]--;
             if(freq[fruits[left]]==0){
                uniqueFruits--;
             }
             left++;
           }
          }
          
            max_len=Math.max(max_len,right-left+1);
            right++;
       

     }
     return max_len;
    }
}