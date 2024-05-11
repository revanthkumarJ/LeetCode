class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
        boolean pos=true;
        int i=0;
        if(s.charAt(0)=='+')
            i++;
        else if(s.charAt(0)=='-')
        {
            pos=false;
            i++;
        }
        long res=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            if(c>='0' && c<='9')
            {
                res=res*10+(c-'0');
                if(res>Integer.MAX_VALUE)
                {
                    if(pos)
                    return Integer.MAX_VALUE;
                    return Integer.MIN_VALUE;
                }
            
            }
            else
            break;
            i++;
        }
        if(pos)
        {
            if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        }
        else
        {
            res=-1*res;
            if(res<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        }
        return (int)res;
    }
}