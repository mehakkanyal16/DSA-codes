class Solution {
    private int Search(int []arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
    public boolean checkIfExist(int[] arr) {
    //   HashMap<Integer,Integer>map=new HashMap<>();
    //   int n=arr.length;
    //   for(int i=0;i<n;i++){
    //     map.put(arr[i],i);
    //   }
    //   for(int i=0;i<n;i++){
    //     if(map.containsKey(2*arr[i])&&map.get(2*arr[i])!=i){
    //         return true;
    //     }
        
    //   }
    // return false;

    //    int n = arr.length;
    //     for (int i = 0; i < n; i++) 
    //         for (int j = 0; j < n; j++) 
    //             if (i != j && arr[i] == 2 * arr[j]) 
    //                 return true;

    //     return false;


    for(int i=0;i<arr.length;i++){
        int index=Search(arr,2*arr[i]);
        if(index>=0&&index!=i){
            return true;
        }
       
        
    }
    return false;

    }
}