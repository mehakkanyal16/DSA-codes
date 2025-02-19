class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String sortedWord=new String(arr);
            map.putIfAbsent(sortedWord,new ArrayList<>());
            map.get(sortedWord).add(str);


        }
        return new ArrayList<>(map.values());
    }
}