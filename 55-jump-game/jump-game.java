class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex=0;
        if(nums.length==1 ){
            return true;
        }
        if(nums[0]==0){
            return false;
        }

        for(int i=0;i<nums.length-1;i++){
          
            int max=i+nums[i];
            if(i>maxIndex){
                return false;
            }
           
             if(max>maxIndex){
                maxIndex=max;
            }
            
             if(maxIndex>=nums.length-1){
                return true;
             }
            
        }

    
        return false;
        
    }
}