class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        pq.addAll(mp.keySet());

        while(!pq.isEmpty()){
            char ch=pq.poll();
            int frq=mp.get(ch);
            while(frq>0){
                sb.append(ch);
                frq--;
            }
        }
        return sb.toString();
    }
}