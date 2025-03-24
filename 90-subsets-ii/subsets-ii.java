class Solution {
     public void generate(List<List<Integer>>ans,List<Integer>list,int[] nums,int index){
      
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        generate(ans,list,nums,index+1);
        list.remove(list.size()-1);
        int i=index+1;
        while(i<nums.length&&nums[i]==nums[i-1]){
            i++;
        }
        generate(ans,list,nums,i);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        generate(ans,list,nums,0);
        return ans;
    }

}