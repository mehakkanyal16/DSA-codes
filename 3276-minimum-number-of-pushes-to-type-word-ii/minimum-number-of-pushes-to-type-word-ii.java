class Solution {
    public int minimumPushes(String word) {
    int[] letterfreq=new int[26];
    for(char c:word.toCharArray()){
        letterfreq[c-'a']++;
    }

    Integer[] sortFreq=new Integer[26];
    for(int i=0;i<26;i++){
        sortFreq[i]=letterfreq[i];
    }
    Arrays.sort(sortFreq,Collections.reverseOrder());

    int totalPresses=0;
    for(int i=0;i<26;i++){
        if(sortFreq[i]==0)break;
        totalPresses+=(i/8+1)*sortFreq[i];
    }
    return totalPresses;
    }
}