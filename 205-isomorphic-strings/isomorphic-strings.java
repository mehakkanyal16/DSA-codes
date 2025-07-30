class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character>mp1=new HashMap<>();
           HashMap<Character,Character>mp2=new HashMap<>();
           for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(mp1.containsKey(c1)&&mp1.get(c1)!=c2)return false;
            if(mp2.containsKey(c2)&&mp2.get(c2)!=c1)return false;
            mp1.put(c1,c2);
            mp2.put(c2,c1);

           }
           return true;

        
    }
}