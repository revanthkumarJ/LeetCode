class Solution {
    public int subsetXORSum(int[] nums) {
        return revanthHelp(nums,0,0);
    }

    public int revanthHelp(int nums[],int i,int currentxor)
    {
        if(i==nums.length)return currentxor;
        return revanthHelp(nums,i+1,currentxor)+revanthHelp(nums,i+1,currentxor^nums[i]);
    }
}