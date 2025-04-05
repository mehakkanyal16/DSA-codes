class Solution {
    public void generateSubsets(int[] nums,int ind,List<List<Integer>>res,List<Integer>list){
        if(ind==nums.length){
            res.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[ind]);
        generateSubsets(nums,ind+1,res,list);
        list.remove(list.size()-1);
        generateSubsets(nums,ind+1,res,list);


    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        generateSubsets(nums,0,res,list);
        int result=0;
        for(List<Integer>li:res){
            int subSetXorTotal=0;
            for(int num:li){
                subSetXorTotal^=num;
            }
            result+=subSetXorTotal;
        }
        return result;
        
    }
}