class Solution {
    public void moveZeroes(int[] nums) {

        int j=-1;
        int n=nums.length;
        if(n==1){
            return;
        }
       
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
      
        int k=j+1;

        while(k<n ){
            if(nums[k]!=0){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j++;
            }
            k++;
        }


    }
}