class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder rev=new StringBuilder("");
        for(int i=0;i<k;i++){
            rev.append(s.charAt(i));
        }
        rev.reverse();
        return new String(rev)+s.substring(k);
    }
}