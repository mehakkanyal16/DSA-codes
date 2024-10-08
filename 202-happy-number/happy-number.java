class Solution { 
    public int findSquare(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans+rem*rem;
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
      HashSet<Integer>set=new HashSet<>();
      while(n!=1){
        if(set.contains(n)){
            return false;
        }else{
            set.add(n);
            n=findSquare(n);
            
        }
      
      }
        return true;
    }
}