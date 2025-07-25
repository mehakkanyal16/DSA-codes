class Solution {
    public int maxSum(int[] nums) {
        //to check negative case:
        int mn=Integer.MIN_VALUE;     
        boolean pos=false;
        for(int num:nums){
            if(num>0){
                pos=true;
                break;
            }
            mn=Math.max(mn,num);
        }
        if(!pos){
            return mn;
        }
        //to check unique positive case:
        Set<Integer>set=new HashSet<>();
        int sum=0;
        for(int num:nums){
            if(num>=0){
                if(!set.contains(num)){
                 if(num>=0){
                    sum+=num;
                 }
            }
            }
            set.add(num);

        }
        return sum;
    }
}