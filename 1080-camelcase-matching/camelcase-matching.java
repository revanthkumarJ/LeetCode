class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res=new ArrayList<>();
        int n=pattern.length();
        for(String s:queries)
        {
            int j=0;
            for(char c:s.toCharArray())
            {
                if(j<n && c==pattern.charAt(j))
                    j++;
                else if(c>='A' && c<='Z')
                j=n+1;
            }
            if(j==n)
            res.add(true);
            else
            res.add(false);
        }
        return res;
    }
}