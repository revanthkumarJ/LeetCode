import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);

        StringBuilder res = new StringBuilder();

        while (st.hasMoreTokens()) {
            res.insert(0, st.nextToken() + " ");
        }

        return res.toString().trim();
    }
}