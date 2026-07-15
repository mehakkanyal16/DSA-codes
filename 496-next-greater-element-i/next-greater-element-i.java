class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        HashMap<Integer,Integer>mp=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for(int num:nums2){

            while(!st.isEmpty()&&num>st.peek()){
                mp.put(st.pop(),num);
            }
            st.push(num);
        }

        // Elements having no next greater element
        while (!st.isEmpty()) {
            mp.put(st.pop(), -1);
        }
        for(int i=0;i<nums1.length;i++){
           arr[i] = mp.get(nums1[i]);

        }

        return arr;
    }
}