class Solution {
    public void sortColors(int[] nums) {
        int first=0;
        int i;
        int last=nums.length-1;
        for(i =0;i<=last;i++)
        {
            while(nums[i]==2 && i<last)
            {
                int temp=nums[i];
                nums[i]=nums[last];
                nums[last]=temp;
                last--;
            }
            while(nums[i]==0 && i>first)
            {
                int temp=nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
                first++;
            }
        }
        
    }
   
}