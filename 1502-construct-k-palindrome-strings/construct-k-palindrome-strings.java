class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int odd_count=0;
        for(Map.Entry<Character,Integer>entry:mp.entrySet()){
             if(entry.getValue()%2!=0){
                odd_count++;
             }
        }
        if(odd_count>k){
            return false;
        }
        else{
            return true;
        }
    }
}