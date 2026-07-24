class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length()){
            return "";
        }
        int left=0;
        int right=0;
        int sIndex=-1;
        int cnt=0;
        int min_len=Integer.MAX_VALUE;
        int[] hash=new int[256];
        for(int i=0;i<t.length();i++){
             hash[t.charAt(i)]++;
        }

        while(right<s.length()){
            if(hash[s.charAt(right)]>0){
                cnt++;
            }
            hash[s.charAt(right)]--;

            while(cnt==t.length()){
                if((right-left+1)<min_len){
                    min_len=right-left+1;
                    sIndex=left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0){
                    cnt--;
                }
                left++;

            }
            right++;
        }

        return (sIndex==-1)?"":s.substring(sIndex,sIndex+min_len);
        
    }
}