class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> array=new HashMap<>();
        array.put(0,-1);
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                sum--;
            else
                sum++;
            if(array.containsKey(sum))
            {
                int a=i-array.get(sum);
                if(a>max)
                max=a;
            }
            else
            array.put(sum,i);
        }
        return max;
    }
}