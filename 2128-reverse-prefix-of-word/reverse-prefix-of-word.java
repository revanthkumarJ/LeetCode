class Solution {
    public String reverse(String s)
    {
        String S="";
        for(int i=s.length()-1;i>=0;i--)
        {
            S=S+s.charAt(i);
        }
        return S;
    }
    public String reversePrefix(String word, char ch) {
        String S="",s="";
        int i=0;
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                s=s+word.charAt(i);
                S=S+reverse(s);
                s="";
                break;
            }
            else
                s=s+word.charAt(i);
        }
        if(i!=word.length())
        return S+word.substring(i+1,word.length());
        return S+s;
    }
}