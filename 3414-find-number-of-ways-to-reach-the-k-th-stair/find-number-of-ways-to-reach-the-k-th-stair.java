class Solution {
    HashMap<String,Integer>dp;
    public int waysToReachStair(int k) {
        dp=new HashMap<>();
        
        return solve(1,k,0,1);
        
    }
    public int solve(int i,int k,int jumps,int canJump){
        int ways=0;
         if(i==k)ways+=1;
        
        String key=i+""+jumps+""+canJump;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
       
        if(i>k+1)return 0;
        if(canJump==1) ways+=solve(i-1,k,jumps,0);
        ways+=solve((int)(i+Math.pow(2,jumps)),k,jumps+1,1);
        dp.put(key,ways);
        return ways;

    }
}