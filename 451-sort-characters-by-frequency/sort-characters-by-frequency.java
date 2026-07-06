class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
     
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());

        while(!pq.isEmpty()){
             Map.Entry<Character,Integer>entry=pq.poll();
        char ch=entry.getKey();
        int freq=entry.getValue();
        for(int i=0;i<freq;i++){
            sb.append(ch);
        }
        }
        return sb.toString();
    }
}