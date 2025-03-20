class Solution {
    public void generate(List<String>result,int max,int open,int close,String s){
        if(s.length()==2*max){
            result.add(s);
            return;
        }
        if(open<max){
            generate(result,max,open+1,close,s+"(");
        }
        if(close<open){
            generate(result,max,open,close+1,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generate(result,n,0,0,"");
        return result;

        
    }
}