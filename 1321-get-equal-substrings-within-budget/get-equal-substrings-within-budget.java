class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int len=0;
        int max=0;
        int start=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            len++;
            while(sum>maxCost && start<=i)
            {
                sum-=arr[start++];
                len--;
            }
            if(len>max)
            max=len;
        }
        return max;
    }
}