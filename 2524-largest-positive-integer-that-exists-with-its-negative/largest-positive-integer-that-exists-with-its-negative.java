class Solution {
    public int findMaxK(int[] nums) {
        int max=0;
        HashSet<Integer> array=new HashSet<>();
        for(int i:nums)
        {
            array.add(i);
            if(Math.abs(i)>max && array.contains(-1*i))
            max=Math.abs(i);
        }
        
        if(max==0)
        return -1;
        return max;
    }
}