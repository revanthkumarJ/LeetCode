class Solution {
    public String maximumOddBinaryNumber(String s) {
        int o=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            o++;
        }
        o--;
        String r="1";
        for(int i=1;i<(s.length()-o);i++)
        {
            r=0+r;
        }
        for(int i=r.length();i<s.length();i++)
        {
            r=1+r;
        }
        return r;
    }
}