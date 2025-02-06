class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String sortedWord=new String(arr);
            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord,new ArrayList<>());
            }
            mp.get(sortedWord).add(str);
        }
        return new ArrayList<>(mp.values());

    }
}