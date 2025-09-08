class Solution {
  
    public int[] getNoZeroIntegers(int n) {
      
        for(int i=1;i<=n;i++){
            int a=i;
            int b=n-i;
           if(!String.valueOf(a).contains("0")&&!String.valueOf(b).contains("0")){
            return new int[] {a,b};
           }
        }
       return new int[0];
        
    }
}