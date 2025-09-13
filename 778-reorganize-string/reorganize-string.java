class Solution {
    public String reorganizeString(String s) {
        StringBuilder result=new StringBuilder();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
       PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> mp.get(b) - mp.get(a));
        pq.addAll(mp.keySet());

    while(pq.size()>=2){
        char c1=pq.poll();
        char c2=pq.poll();
        result.append(c1);
        
        result.append(c2);
        mp.put(c1,mp.get(c1)-1);
        mp.put(c2,mp.get(c2)-1);
        if(mp.get(c1)>0)pq.add(c1);
        if(mp.get(c2)>0)pq.add(c2);

    }
    while(!pq.isEmpty()){
        char ch=pq.poll();
        if(mp.get(ch)>1)return "";
        result.append(ch);

    }
    return result.toString();




    }
}