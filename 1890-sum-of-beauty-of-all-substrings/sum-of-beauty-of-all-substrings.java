class Solution {
    public int beautySum(String s) {
   

        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer>mp=new HashMap<>();
            for(int j=i;j<n;j++){

            char ch=s.charAt(j);
            mp.put(ch,mp.getOrDefault(ch,0)+1);   

             int maxi=Integer.MIN_VALUE;
             int mini=Integer.MAX_VALUE;

               

                for(int val:mp.values()){
                    mini=Math.min(mini,val);
                    maxi=Math.max(maxi,val);
                }
                  
                sum=sum+(maxi-mini);



            }
        }
        return sum;
    }
}