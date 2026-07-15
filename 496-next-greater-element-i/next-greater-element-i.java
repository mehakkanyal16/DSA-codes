class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        HashMap<Integer,Integer>mp=new HashMap<>();

        //stored index in hashmap for second arr;
        for(int i=0;i<nums2.length;i++){
            mp.put(nums2[i],i);
        }

        //iterating over first array :
        for(int i=0;i<nums1.length;i++){
            int idx=mp.get(nums1[i]);
            boolean found=false;
            for(int j=idx;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    arr[i]=nums2[j];
                    found=true;
                    break;
                }
            }
            // no greater element , -1:
            if(!found){
                arr[i]=-1;
            }
        }
        return arr;
    }
}