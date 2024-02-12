class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> array=new HashMap<>();
        int n=nums.length;
        for(int i:nums)
        {
            array.put(i,array.getOrDefault(i,0)+1);
            if(array.get(i)>(n/2))
            return i;
        }
        return -1;
    }
}