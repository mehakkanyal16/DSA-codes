class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<ArrayList<String>>list=new ArrayList<>();
        HashMap<String,List<String>>mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String newWord=new String(arr);
            mp.putIfAbsent(newWord,new ArrayList<>());
            mp.get(newWord).add(strs[i]);

        }
        return new ArrayList<>(mp.values());
        
        
    }
}