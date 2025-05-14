class Solution {
    public int findPairs(int[] arr, int k) {
      if(k<0)return 0;
      HashSet<Integer>seen=new HashSet<>();
      HashSet<Integer>result=new HashSet<>();
      for(int num:arr){
        if(seen.contains(num-k)){
            result.add(num-k);
        }
        if(seen.contains(num+k)){
            result.add(num);
        }
        seen.add(num);
      }
      return result.size();
        
    }
}