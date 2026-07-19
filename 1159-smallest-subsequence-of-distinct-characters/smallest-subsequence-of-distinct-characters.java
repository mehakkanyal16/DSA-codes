class Solution {
    public String smallestSubsequence(String s) {
    int[] freq = new int[26];
    boolean[] visited=new boolean[26];
    StringBuilder sb=new StringBuilder();
    Stack<Character>st=new Stack<>();

    //count freq: 

    for(char ch :s.toCharArray()){
        freq[ch-'a']++;
    }

    //traverse string :

    for(char ch:s.toCharArray()){
        //reduce freq of that char 
        freq[ch-'a']--;

        //already in answer: 
        if(visited[ch-'a']){
            continue;
        }
        while(!st.isEmpty()&&st.peek()>ch &&freq[st.peek()-'a']>0){
             visited[st.pop() - 'a'] = false;
        }

        st.push(ch);
        visited[ch-'a']=true;

    }    

    while (!st.isEmpty()) {
    sb.append(st.pop());
    }
     return sb.reverse().toString();

        

    }
}