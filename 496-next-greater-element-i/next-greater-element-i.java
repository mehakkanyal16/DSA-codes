class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty()&&st.peek()<num){
                mp.put(st.pop(),num);
            }
            st.push(num);
        }
        while(!st.isEmpty()){
            mp.put(st.pop(),-1);
        }
        int[] result= new int[nums1.length];
        for(int i=0;i<result.length;i++){
            result[i]=mp.get(nums1[i]);
        }
        return result;
      
        
    }
}