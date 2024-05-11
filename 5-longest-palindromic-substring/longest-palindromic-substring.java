class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1)
        return s;

        int max=1;
        String maxi=s.substring(0,1);

        for(int i=0;i<n;i++)
        {
            String odd=expand(s,n,i,i);
            String even=expand(s,n,i,i+1);
            if(odd.length()>max)
            {
                maxi=odd;
                max=odd.length();
            }
            if(even.length()>max)
            {
                maxi=even;
                max=even.length();
            }
        }
        return maxi;
    }

    public String expand(String s,int n,int left,int right)
    {
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}