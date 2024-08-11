class itemComparator implements Comparator<int[]>{

    public int compare(int[] x,int[] y){
       return Integer.compare(x[1],y[1]);

    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int n=arr.length;
        if(n==0)
            return 0;
        Arrays.sort(arr,new itemComparator());
        int count=1;
        int limit=arr[0][1];


        for(int i=1;i<n;i++){
            if(arr[i][0]>=limit){
                count++;
                limit=arr[i][1];
            }
        }

        return n-count;

        
    }
}

