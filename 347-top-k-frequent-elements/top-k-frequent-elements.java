class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
       for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
        pq.offer(entry);
        if(pq.size()>k){
            pq.poll();
        }
       }
       int[] res=new int[k];
       for(int i=0;i<k;i++){
        res[i]=pq.poll().getKey();

       }
       return res;
        
        
    }
}