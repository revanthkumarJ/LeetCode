class Solution {
    public String longestCommonPrefix(String[] s) {
        int min=0;
        for(int i=1;i<s.length;i++)
        {
            if(s[i].length()<s[min].length())
            min=i;
        }
        String comp=s[min];
        for(int i=0;i<s.length;i++)
        {
            while(!(s[i].substring(0,comp.length())).equals(comp))
            {
                comp=comp.substring(0,comp.length()-1);
                if(comp=="")
                return "";
            }
        }
        return comp;
    }
}