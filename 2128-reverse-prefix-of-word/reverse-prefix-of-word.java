class Solution {
    
    public String reversePrefix(String word, char ch) {
        String S="";
        StringBuilder s=new StringBuilder();
        int i=0;
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                s.append(word.charAt(i));
                S=S+(s.reverse().toString());
                s=new StringBuilder("");
                break;
            }
            else
                s.append(word.charAt(i));
        }
        if(i!=word.length())
        return S+word.substring(i+1,word.length());
        return S+s;
    }
}