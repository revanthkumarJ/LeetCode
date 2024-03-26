class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> array=new HashSet<>();
        for(int i:nums)
        {
            array.add(i);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!array.contains(i))
            return i;
        }
        return nums.length+1;
    }
}