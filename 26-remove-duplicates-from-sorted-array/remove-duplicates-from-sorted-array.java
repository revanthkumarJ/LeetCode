class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(prev!=nums[i])
            {
                prev=nums[i];
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}