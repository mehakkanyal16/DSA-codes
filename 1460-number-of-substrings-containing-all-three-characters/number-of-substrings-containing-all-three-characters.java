class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        int[] lastSeen={-1,-1,-1};
        for(int i=0;i<n;i++){
            lastSeen[s.charAt(i)-'a']=i;
            if(lastSeen[0]!=-1&&lastSeen[1]!=-1&&lastSeen[2]!=-1){
                  count=count+(1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])));
            }
        }
        return count;
    }
}