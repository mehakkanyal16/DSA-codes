class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>ans=new ArrayList<>();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(String word:words2){
            HashMap<Character,Integer>temp=new HashMap<>();
            for(char c:word.toCharArray()){
                temp.put(c,temp.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer>entry:temp.entrySet()){
                mp.put(entry.getKey(), Math.max(mp.getOrDefault(entry.getKey(), 0), entry.getValue()));
              }
        }
        for(String word:words1){
            HashMap<Character,Integer>wordMap=new HashMap<>();
            for(char c:word.toCharArray()){
                wordMap.put(c,wordMap.getOrDefault(c,0)+1);
            }
             boolean isSubset = true;
            for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
                if (wordMap.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                    isSubset = false;
                    break;
                }
            }
            
            if (isSubset) {
                ans.add(word);
            }
        }
        return ans;
            
        

    }
}