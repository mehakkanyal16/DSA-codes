class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int n=arr.length;
       int[] temp=new int[n];
       for(int i=0;i<n;i++){
        temp[i]=arr[i];
       }
       Arrays.sort(temp);
       HashMap<Integer,Integer>mp=new HashMap<>();
       int rank=1;
       for(int i=0;i<n;i++){
            if(!mp.containsKey(temp[i])){
                mp.put(temp[i],rank++);
            }
       }
       for(int i=0;i<n;i++){
        arr[i]=mp.get(arr[i]);
       }
       return arr;

        
    }
}