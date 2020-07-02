class Solution {
    public int singleNumber(int[] nums) {
       // int result = 0;
        int i =0;
        Arrays.sort(nums);
       for(i =0;i<nums.length-2;i+=3)
       {
           if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
             
               continue;
           }
           else{
               //result = num[i];
              // break;
              return nums[i]; 
           }             
               
       }
        return nums[i];
        
    }
}