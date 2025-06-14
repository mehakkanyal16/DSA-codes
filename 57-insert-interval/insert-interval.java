class Solution {
    public int[][] insert(int[][] interval, int[] newInterval) {
        List<int[]>result=new ArrayList<>();
        int i=0;
        int n=interval.length;
        while(i<n&&interval[i][1]<newInterval[0]){
            result.add(interval[i]);
            i++;

        }
        while(i<n&&interval[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],interval[i][0]);
            newInterval[1]=Math.max(newInterval[1],interval[i][1]);

            i++;
        }
        result.add(newInterval);
         while (i < n) {
            result.add(interval[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
        
    }
}