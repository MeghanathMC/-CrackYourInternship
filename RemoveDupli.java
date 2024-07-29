class RemoveDupli{
    public static void main(String[] args) {
        int nums[]={1,2,1,3,4,2,1,4};
       System.out.println( removeDuplicates(nums)); 
    }
    public int removeDuplicates(int[] nums) {
        
               int j=0;
        
               for(int i=0;i<nums.length;i++){
                if(nums[i]==nums[j]){
                    continue;
                }
                j++;
                nums[j]=nums[i];
               }
               return ++j;
        
                
        
        
                
            }
        }
    
}