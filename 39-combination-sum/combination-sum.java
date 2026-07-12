class Solution {
    public void generate( List<List<Integer>> res,List<Integer>list,int[] candidates ,int k,int i ){
        if(i==candidates.length){
            if(k==0){
            res.add(new ArrayList<>(list));
            return ;
            }

            return ;
        }
        //take 
        if(candidates[i]<=k){
            list.add(candidates[i]);
            generate(res,list,candidates,k-candidates[i],i);
            list.remove(list.size()-1);
        }

        //not take
        generate(res,list,candidates,k,i+1);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        generate(res,list,candidates,target,0);
        return res;
    }
}