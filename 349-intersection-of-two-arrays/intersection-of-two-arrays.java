class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>a=new HashSet<>();
        HashSet<Integer>b=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(!b.contains(nums2[i]) && a.contains(nums2[i]))
            b.add(nums2[i]);
        }
        int array[]=new int[b.size()];
        int i=0;
        for(int j:b)
        {
            array[i++]=j;
        }
        return array;

    }
}