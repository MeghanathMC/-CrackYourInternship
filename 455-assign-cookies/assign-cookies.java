class Solution {
    public int findContentChildren(int[] greed, int[] size) {

        Arrays.sort(greed);
        Arrays.sort(size);


        int l=0;
        int r=0;    
        // int count=0;
        int m=greed.length;
        int n=size.length;

        while(l<m && r<n){
            if(size[r]>=greed[l]){
                r++;
                l++;
            }
            else{
            r++;
            }
        }

        return l;

        
    }
}