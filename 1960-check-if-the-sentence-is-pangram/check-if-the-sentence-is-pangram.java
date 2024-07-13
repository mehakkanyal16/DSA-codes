class Solution {
    public boolean checkIfPangram(String sentence) {
        // HashSet<Character>mp=new HashSet<>();
        // for(int i=0;i<sentence.length();i++){
        //     mp.add(sentence.charAt(i));
        // }
        // for(char i='a';i<='z';i++){
        //     if(!mp.contains(i))return false;
        // }
        // return true;
        for (char ch = 'a' ; ch <= 'z'; ch++)
            if (sentence.indexOf(ch)==-1)
            return false;
        return true;
        
    }
}