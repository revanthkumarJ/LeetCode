class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> array=new HashSet<>();
        int n=nums.length;
        long sum=0;
        int repeat=-1;
        for(int a:nums)
        {
            if(array.contains(a))
            {
                repeat=a;
            }
            else
            {
                sum=sum+a;
                array.add(a);
            }
        }
        int missed=(int)((((long)n*(n+1))/2)-sum);
        return new int[]{repeat,missed};
    }
}