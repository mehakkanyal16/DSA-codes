class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum=0;
        for(int i=0;i<derived.length;i++){
            sum=sum^derived[i];
        }
        return sum==0;
    }
    
}