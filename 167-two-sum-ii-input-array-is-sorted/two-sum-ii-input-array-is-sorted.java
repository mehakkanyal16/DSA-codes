class Solution {
    public int[] twoSum(int[] num, int target) {
        int n=num.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int sum=num[start]+num[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }else if(sum<target){
                start++;
            }else if(sum>target){
                end--;
            }else{
                start++;
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}