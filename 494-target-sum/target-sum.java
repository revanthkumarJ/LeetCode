class Solution {
    public int get(int nums[],int i,int sum,int target)
    {
        if(i==0)
        {
            if(sum+nums[0]==target && sum-nums[0]==target)
            return 2;
            if(sum+nums[0]==target)
            return 1;
            if(sum-nums[0]==target)
            return 1;
            return 0;
        }
        else
        {
            return get(nums,i-1,sum+nums[i],target)+get(nums,i-1,sum-nums[i],target);
        }
    }
    public int findTargetSumWays(int[] nums, int target) {
        return get(nums,nums.length-1,0,target);
    }
}