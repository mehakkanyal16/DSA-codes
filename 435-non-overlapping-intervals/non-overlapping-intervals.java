class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt=1;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int lastEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastEnd){
                cnt++;
                lastEnd=intervals[i][1];
            }

        }
        return intervals.length-cnt;
        
    }
}