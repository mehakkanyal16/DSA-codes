class Solution {
    public int digitSum(int n){
        int dSum=0;
        while(n>0){
            int rem=n%10;
            dSum+=rem;
            n=n/10;
        }
        return dSum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        // calculate digit sum and put it in hashMap 
        for(int i=1;i<=n;i++){
            int digitSum=digitSum(i);
            mp.put(digitSum,mp.getOrDefault(digitSum,0)+1);
        }
        int maxFreq=0;
        for(int freq:mp.values()){
            if(freq>maxFreq){
                maxFreq=freq;
            }

        }
        int count=0;
        for(int freq:mp.values()){
            if(freq==maxFreq){
                count++;
            }
        }
        return count;
      
        
    }
}