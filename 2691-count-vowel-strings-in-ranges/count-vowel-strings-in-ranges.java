class Solution {
    public boolean isVowel(Character c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] preSum=new int[n+1];
        for(int i=0;i<n;i++){
            Character f= words[i].charAt(0);
            Character l=words[i].charAt(words[i].length()-1);
            if(isVowel(f)&&isVowel(l)){
                preSum[i+1]=1+preSum[i];
            }else{
                preSum[i+1]=preSum[i];
            }
        }
            int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = preSum[right + 1] - preSum[left]; // Use prefix sums to calculate result
        }
        
        return ans;
    }
}