class Solution {
    public int beautySum(String s) {
      
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[126];

            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                 int maxf = Integer.MIN_VALUE;
                int minf = Integer.MAX_VALUE;
                for( int f:freq){
                    if(f>0){
                        maxf=Math.max(maxf,f);
                        minf=Math.min(minf,f);

                    }
                }
                sum+=maxf-minf;

            }
        }
        return sum;
        
    }
}