class Solution {
    public int numRabbits(int[] answers) {
        int total =0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<answers.length;i++){
            mp.put(answers[i],mp.getOrDefault(answers[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            
        int k=entry.getKey();
        int count=entry.getValue();
        int groupSize=k+1;
        int group=(int)Math.ceil((double)count/groupSize);
        total+=group*groupSize;
        }

    
           return total;
    }
 
}