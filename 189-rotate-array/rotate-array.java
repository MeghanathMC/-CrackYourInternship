class Solution {

    public void reverse(int arr[],int start,int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] arr, int k) {
        
        int n=arr.length;//7
        k=k%n;
        int i=n-k;//7-3=4
        int j=n-1;
        if(n==0 ||n==1){
            return;
        }
        // if(k>n){
        //     return;
        // }
        reverse(arr,0,n-k-1);//0,3
        reverse(arr,n-k,n-1);//4,6
        reverse(arr,0,n-1);//0,6
     
        
       
    }
}
