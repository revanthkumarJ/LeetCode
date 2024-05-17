class Solution {
    int dp[][];
    public int call(int m,int n)
    {
        if(m<0 || n<0)return 0;
        if(m==0 && n==0)
        return 1;
        if(dp[m][n]!=0)return dp[m][n];
        dp[m][n]= call(m-1,n)+call(m,n-1);
        return dp[m][n];

    }
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        return call(m-1,n-1);


    }
}