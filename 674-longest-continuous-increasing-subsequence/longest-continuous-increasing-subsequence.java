class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int len=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            len++;
            else
            {
                if(max<len)
                max=len;
                len=1;
            }
        }
        if(max<len)
        max=len;
        return max;
    }
}