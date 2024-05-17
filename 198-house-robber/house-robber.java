class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        int dp[]=new int[n];
        int a=nums[0];
        int b=nums[1];
        if(a>b)
        b=a;
        for(int i=2;i<n;i++)
        {
            int r=Math.max(nums[i]+a,b);
            a=b;
            b=r;
        }
        return b;
    }
}