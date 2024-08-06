class Solution {
    public int minimumPushes(String word) {
          int[] freqArray=new int[26];
    for(char c :word.toCharArray()){
        freqArray[c-'a']++;
    }
    Integer[] sortArray=new Integer[26];

    for(int i=0;i<26;i++){
        sortArray[i]=freqArray[i];
    }
    Arrays.sort(sortArray,Collections.reverseOrder());
    int totalPresses=0;
    for(int i=0;i<26;i++){
         if(sortArray[i]==0) break;
        totalPresses+=(i/8+1)*sortArray[i];
       
    }
   return totalPresses;

        
    }
}