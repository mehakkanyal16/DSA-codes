class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int totFreq=0;
         HashMap<Integer,Integer>mp=new HashMap<>();
         for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
         }

         int maxFreq = 0;
        for (int freq : mp.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
        
         for(int freq:mp.values()){
            if(freq==maxFreq){
                totFreq+=freq;
            }
         }
        

         return totFreq;
    }
}