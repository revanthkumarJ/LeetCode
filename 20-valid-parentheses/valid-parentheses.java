class Solution {
    public boolean isEqual(char left , char right){
        return (left=='(' && right==')') || (left =='[' && right==']') || (left=='{' && right=='}');
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='(')
            st.push(c);
            else{
                if(st.size()==0) return false;
                char p= st.pop();
                if(!isEqual(p,c))
                return false;
            }
        }

        return st.size()==0;
    }
}