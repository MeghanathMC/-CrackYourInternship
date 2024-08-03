class Solution {
    public int el;
    public int majorityElement(int[] arr) {

      /*  int n=arr.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    cnt++;
                }
            }

            if(cnt > (n/2)){
                return arr[i];
            }
        }
        return -1;*/


        // HashMap<Integer,Integer> mp=new HashMap<>();

        // int n=nums.length;

        // for(int i=0;i<n;i++){
        //     int value=mp.getOrDefault(nums[i],0);
        //     mp.put(nums[i],value+1);
        // }

        // //now to count the occurences

        // for(Map.Entry<Integer,Integer> it : mp.entrySet()){
        //     if(it.getValue() > (n/2)){
        //         return it.getKey();
        //     }

        // }

        // return -1;
        int n=arr.length;
        int cnt=0;
        

        for(int i=0;i<n;i++){
            if(cnt==0){
                el=arr[i];
                cnt++;
            }
            else if(arr[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }


        int cnt1=0;

        for(int j=0;j<n;j++){
            if(arr[j]==el){
                cnt1++;
            }
        

        if(cnt1>(n/2)){
            return arr[j]; 
        }
        }
        return -1;
    }
}