class Solution {
    public void generate(List<String>res,int open,int close,int max,String s){
        if(s.length()==2*max){
             res.add(s);
             return;
        }
        if(open<max){
            generate(res,open+1,close,max,s+"(");
        }
        if(close<open){
            generate(res,open,close+1,max,s+")");

        }

    }
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        generate(res,0,0,n,"");
        return res;
        
    }
}