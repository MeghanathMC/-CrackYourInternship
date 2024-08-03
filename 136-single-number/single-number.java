class Solution {
    public int singleNumber(int[] nums) {


        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int val=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],val+1);
        }


        for(Map.Entry<Integer,Integer> it: hm.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
        
    }
}