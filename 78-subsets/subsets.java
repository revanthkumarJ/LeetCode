class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> array=new ArrayList<>();
        int n=nums.length;
        int p=(int)Math.pow(2,n);
        for(int i=0;i<p;i++)
        {
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i& (1<<j))!=0)
                a.add(nums[j]);
            }
            array.add(a);
        }
        return array;
    }
}