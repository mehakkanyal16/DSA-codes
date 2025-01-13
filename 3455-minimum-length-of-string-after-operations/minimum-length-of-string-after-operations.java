class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int count=0;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        for(int frequency:freq){
            if(frequency==0){
                continue;
            }

            if(frequency%2==0){
                count=count+2;
            }else{
                count=count+1;
            }
        }
        return count;
        
    }
}