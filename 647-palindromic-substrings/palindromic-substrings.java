class Solution {
    public boolean isPalindrome(String s)
    {
        int n=s.length();
        for(int i=0;i<(n/2);i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count=s.length();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(isPalindrome(s.substring(i,j+1)))
                count++;
            }
        }
        return count;
    }
}