class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        int max1=0;
        int a=nums[0];
        int b=nums[1];
        if(a>b)
        b=a;
        for(int i=2;i<n-1;i++)
        {
            int r=Math.max(nums[i]+a,b);
            a=b;
            b=r;
        }
        max1=b;
        a=nums[1];
        b=nums[2];
        if(a>b)
        b=a;
        for(int i=3;i<n;i++)
        {
            int r=Math.max(nums[i]+a,b);
            a=b;
            b=r;
        }
        return Math.max(b,max1);

    }
}