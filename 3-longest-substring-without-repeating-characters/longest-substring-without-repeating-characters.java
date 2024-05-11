class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        HashSet<Character> set=new HashSet<>();
        int start=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            while(set.contains(c))
            {
                set.remove(s.charAt(start++));
            }
            set.add(c);
            int r=i-start+1;
            if(r>max)
            max=r;
        }
        return max;
    }
}