import java.util.*;

public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);  // Initialize with 0 odd count

        int count = 0;
        int oddCount = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddCount++;
            }

            // If there exists a prefix with (oddCount - k), that means there are subarrays with k odd numbers
            count += countMap.getOrDefault(oddCount - k, 0);

            // Update the countMap
            countMap.put(oddCount, countMap.getOrDefault(oddCount, 0) + 1);
        }

        return count;
    }
}
