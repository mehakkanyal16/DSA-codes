class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());
        StringBuilder result=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer>entry=pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return result.toString();
        
    }
}