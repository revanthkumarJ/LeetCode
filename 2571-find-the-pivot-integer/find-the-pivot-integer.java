class Solution {
    public int pivotInteger(int n) {
        int r=(n*(n+1))/2;
        int l=0;
        for(int i=1;i<=n;i++)
        {
            l=l+i;
            if(l==r)
            return i;
            r=r-i;
        }
        return -1;
    }
}