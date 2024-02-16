class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashSet<Integer> array=new HashSet<>();
        int nums1[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            array.add(nums[i]);
            nums1[i]=array.size();
        }
        array=new HashSet<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            array.add(nums[i]);
            nums[i]=array.size();
        }
        for(int i=0;i<nums.length-1;i++)
        {
            nums1[i]=nums1[i]-nums[i+1];
        }
        return nums1;
    }
}