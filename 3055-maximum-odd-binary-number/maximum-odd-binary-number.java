class Solution {
    public String maximumOddBinaryNumber(String s) {
        int o=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            o++;
        }
        o--;
        StringBuilder r=new StringBuilder("1");
        for(int i=1;i<(s.length()-o);i++)
        {
            r.append(0);
        }
        for(int i=r.length();i<s.length();i++)
        {
            r.append(1);
        }
        r.reverse();
        return r.toString();
    }
}