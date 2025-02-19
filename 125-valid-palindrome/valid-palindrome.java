class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            else if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
        
    }
}