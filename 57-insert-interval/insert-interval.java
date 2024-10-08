class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int i=0, n=intervals.length;
       List<int[]> res=new ArrayList<>();
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;

        }

        while(i<n && intervals[i][0] <=newInterval[1]){
            newInterval[0]=Integer.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Integer.max(newInterval[1],intervals[i][1]);
            i++;
        }

        res.add(newInterval);

        while(i<n){
            res.add(intervals[i]);
            i++;

        }

        int arr[][]=new int[res.size()][];
        return res.toArray(arr);


    }
}