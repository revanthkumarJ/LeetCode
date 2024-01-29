class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min=-1;
        HashSet<Integer> array=new HashSet<>();
        for(int i:nums1)
        {
            array.add(i);
        }
        for(int i:nums2)
        {
            if(array.contains(i))
            {
                if(min==-1)
                min=i;
                else if(min>i)
                min=i;
            }
        }
        return min;
    }
}