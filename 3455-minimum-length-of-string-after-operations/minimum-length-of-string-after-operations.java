class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int count=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:mp.entrySet()){
            if(entry.getValue()%2!=0){
                count=count+ 1;
            }
            if(entry.getValue()%2==0){
                count=count+ 2;
            }
        }
        return count;
    }
}