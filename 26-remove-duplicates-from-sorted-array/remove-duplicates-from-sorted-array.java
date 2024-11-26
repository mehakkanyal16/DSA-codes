class Solution {
    public int removeDuplicates(int[] nums) {
    //     if(nums.length==0){
    //         return 0;
    //     }
    //    int indx=1;
    //    for(int i=1;i<nums.length;i++){
    //       if(nums[i]!=nums[i-1]){
    //         nums[indx]=nums[i];
    //         indx++;
    //       }
    //    }
    //    return indx;
    // ArrayList<Integer>list=new ArrayList<>();
    // list.add(nums[0]);
    // for(int i=1;i<nums.length;i++){
    //     if(nums[i]!=nums[i-1]){
    //         list.add(nums[i]);
    //     }
    // }
    // for(int i=0;i<list.size();i++){
    //     nums[i]=list.get(i);
    // }
    // return list.size();


    HashSet<Integer>set=new HashSet<>();
    int write=0;
    for(int i=0;i<nums.length;i++){
       if(!set.contains(nums[i])){
        set.add(nums[i]);
        nums[write++]=nums[i];

       }

    }
    return write;
        
    }
}