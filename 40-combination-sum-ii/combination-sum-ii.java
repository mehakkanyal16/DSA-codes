class Solution {

       public void generate( List<List<Integer>> res,List<Integer>list,int[] candidates ,int k,int idx ){
        if(k==0){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx&&candidates[i]==candidates[i-1]){
                continue;
            }

            if(candidates[i]>k){
                break;
            }
            list.add(candidates[i]);
            generate(res,list,candidates,k-candidates[i],i+1);
            list.remove(list.size()-1);
        }


    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(candidates);
        generate(res,list,candidates,target,0);
        return res;
    }
}