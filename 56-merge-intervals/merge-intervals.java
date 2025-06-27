class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start=intervals[0][0];

        int end=intervals[0][1];
        List<int[]>list=new ArrayList<>();


        for(int i=0;i<intervals.length;i++){
            int currStart=intervals[i][0];
            int currEnd=intervals[i][1];

            if(end>=currStart){
                //merge intervals
                end=Math.max(end,currEnd);


            }else{
                //No overlap
                list.add(new int[]{start,end});
                start=currStart;
                end=currEnd;


            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
        
    }
}