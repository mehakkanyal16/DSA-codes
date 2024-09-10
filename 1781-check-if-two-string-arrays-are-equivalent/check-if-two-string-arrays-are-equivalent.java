class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String joinedWord1=String.join("",word1);
       String joinedWord2=String.join("",word2);
       return joinedWord1.equals(joinedWord2);
    }
}