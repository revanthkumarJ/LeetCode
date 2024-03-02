class Solution {
    public boolean check(int[] nums) {
        boolean start=false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(start)
                return false;
                else
                start=true;
            }
        }
        if(start && nums[0]<nums[nums.length-1])
        return false;
        return true;
    }
}