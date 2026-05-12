class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder("");

        int curr =0;

        for(char c:s.toCharArray()){
            if(c=='('){
                curr++;
                if(curr!=1)
                res.append(c);
            }
            else if (c==')'){
                curr--;
                if(curr!=0){
                    res.append(c);
                }
            }
        }

        return new String(res);
    }
}