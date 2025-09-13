class Solution {
    public int maxFreqSum(String s) {
        int vMaxFreq=0;
        int cMaxFreq=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
  for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
    char key = entry.getKey();
    int value = entry.getValue();
    if(key=='a'||key=='e'||key=='i'||key=='o'||key=='u'){
        if(value>vMaxFreq){
            vMaxFreq=value;
        }
    }else{
        if(value>cMaxFreq){
        cMaxFreq=value;
        }
    }
    
  }
  return cMaxFreq+vMaxFreq;
    

        
    }
}