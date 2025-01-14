class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] res=new int[n];
         Set<Integer> elementsInA = new HashSet<Integer>();
        Set<Integer> elementsInB = new HashSet<Integer>();
       for (int currentIndex = 0; currentIndex < n; ++currentIndex) {
            // Add current elements from A and B to respective sets
            elementsInA.add(A[currentIndex]);
            elementsInB.add(B[currentIndex]);

            int commonCount = 0;
            for (int element : elementsInA) {
                if (elementsInB.contains(element)) {
                    ++commonCount;
                }
            }

         res[currentIndex] = commonCount;
        }
       return res;
    }
}