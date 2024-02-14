class Solution {
    public int[] rearrangeArray(int[] nums) {
        int array[]=new int[nums.length];
        int o=1,e=0;
        for(int i:nums)
        {
            if(i>0)
            {
                array[e]=i;
                e=e+2;
            }
            else{
                array[o]=i;
                o=o+2;
            }
        }
        return array;
    }
}