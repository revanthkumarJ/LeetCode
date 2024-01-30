class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens)
        {
            if(s.length()==1)
            {
                char o=s.charAt(0);
                if(o=='+' || o=='-' || o=='/' || o=='*')
                {
                    int op2=st.pop();
                    int op1=st.pop();
                    if(o=='+')
                    st.push(op1+op2);
                    else if(o=='-')
                    st.push(op1-op2);
                    else if(o=='*')
                    st.push(op1*op2);
                    else
                    st.push(op1/op2);
                }
                else
                st.push(Integer.parseInt(s));
            }
            else
            {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}