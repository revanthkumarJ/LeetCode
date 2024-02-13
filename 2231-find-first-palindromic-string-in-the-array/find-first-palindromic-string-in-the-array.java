class Solution {
    public boolean isPalindrome(String s)
    {
        int n=s.length();
        for(int i=0;i<(n/2);i++)
        {
            if(s.charAt(i)!=s.charAt(n-1-i))
            return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
            return words[i];
        }
        return "";
    }
}