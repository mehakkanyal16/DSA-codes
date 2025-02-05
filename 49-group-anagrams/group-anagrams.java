class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>>mp=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String sortedword=new String(arr);
            if(!mp.containsKey(sortedword)){
                mp.put(sortedword,new ArrayList<>());
            }
            mp.get(sortedword).add(str);

        }
        return new ArrayList<>(mp.values());
        
    }
}