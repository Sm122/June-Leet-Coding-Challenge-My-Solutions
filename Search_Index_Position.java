class Solution {
    public int searchInsert(int[] nums, int target) {
        int index= Arrays.binarySearch(nums,target);
        int res=0;
        if(index<0)
        {
            int i =0;
            for(i =0;i<nums.length;i++)
            {
                if(nums[i]>target)
                {
                   res=i;
                    break;
                }
            }
            if(i==nums.length)
            {
                res=nums.length;
            }
        }
        else
        {
            res=index;
        }
      return res;
    }
}