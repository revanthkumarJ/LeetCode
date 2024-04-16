class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]!=nums[i])
                break;
                count++;
                nums[j]++;
            }
        }
        return count;
    }
}