class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int cnt=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            char c=entry.getKey();
            int firstIndex=s.indexOf(c);
            int lastIndex=s.lastIndexOf(c);
            if(lastIndex-firstIndex>1){
                HashSet<Character>hs=new HashSet<>();
                for(int i=firstIndex+1;i<lastIndex;i++){
                    hs.add(s.charAt(i));
                }
                cnt+=hs.size();
            }
        }
        return cnt;
    }
}