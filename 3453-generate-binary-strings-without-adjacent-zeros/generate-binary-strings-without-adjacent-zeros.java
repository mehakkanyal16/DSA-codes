class Solution {
    public void generate(List<String>ans,int n,String s,Character lastChar){
        if(n==0){
            ans.add(s);
            return;
        }
      
        generate(ans,n-1,s+"1",'1');
        if(lastChar!='0'){
            generate (ans,n-1,s+"0",'0');
        }
      
    }
    public List<String> validStrings(int n) {
        List<String>ans=new ArrayList<>();
        generate(ans,n,"",'1');
        return ans;
        
    }
}