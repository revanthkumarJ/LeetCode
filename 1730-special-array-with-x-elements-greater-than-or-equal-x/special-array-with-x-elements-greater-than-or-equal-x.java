class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        int max=0;
        
        for(int i:nums)
        {
            if(i<=n)
            arr[i]++;
            else
            max++;
        }
        arr[n]+=max;
        for(int i=n;i>=1;i--)
        {
            arr[i-1]+=arr[i];
        }
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]==i)
            return i;
        }
        return -1;

    }
}