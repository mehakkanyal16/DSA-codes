class Solution {
    public int findMin(int[] nums) {
         int c = Arrays.stream(nums).min().getAsInt();
        return c;
    }
}