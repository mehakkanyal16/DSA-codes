class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    arr[i]=arr[i]+Math.abs(j-i);
                }
            }
        }
        return arr;
    }
}