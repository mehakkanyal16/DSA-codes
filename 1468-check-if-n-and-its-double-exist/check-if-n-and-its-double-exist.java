class Solution {
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

       int n = arr.length;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                if (i != j && arr[i] == 2 * arr[j]) 
                    return true;

        return false;

    }
}