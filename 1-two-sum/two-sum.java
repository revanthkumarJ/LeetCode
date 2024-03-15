class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> array=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int ele=nums[i];
            if(array.containsKey(target-ele))
                return new int[]{i,array.get(target-ele)};
            else
                array.put(ele,i);
        }
        return new int[]{-1,-1};
    }
}