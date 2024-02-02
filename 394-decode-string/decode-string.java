class Solution {
    public String decodeString(String s) 
    {
        StringBuilder r=new StringBuilder("");
        Stack<Integer> num=new Stack<>();
        Stack<StringBuilder> st=new Stack<>();
        int n=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
                n=n*10+(c-'0');
            else if(c=='[')
            {
                num.push(n);
                n=0;
                st.push(r);
                r=new StringBuilder("");
            }
            else if(c==']')
            {
                StringBuilder temp=r;
                r=st.pop();
                int k=num.pop();
                while(k-->0)
                {
                    r.append(temp);
                }
            }
            else
            r.append(c);
        }
        return r.toString();
    }
}