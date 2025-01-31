import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Append nums2 to nums1
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        // Sort the entire nums1 array
        Arrays.sort(nums1);
    }
}