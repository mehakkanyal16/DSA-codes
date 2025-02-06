class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int numdiff=0;
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1!=c2){
                numdiff++;
                if(numdiff>2)return false;
            }
            freq1[c1-'a']++;
            freq2[c2-'a']++;

        }
        return Arrays.equals(freq1,freq2);
    }
}