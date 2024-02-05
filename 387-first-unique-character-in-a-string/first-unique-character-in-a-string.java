class Solution {
    public int firstUniqChar(String s) {
        int start=Integer.MAX_VALUE;
        for(char a='a';a<='z';a++)
        {
            int ind=s.indexOf(a);
            if(ind!=-1 && ind==s.lastIndexOf(a))
            start=Math.min(start,ind);
        }
        if(start==Integer.MAX_VALUE)
        return -1;
        return start;
    }
}