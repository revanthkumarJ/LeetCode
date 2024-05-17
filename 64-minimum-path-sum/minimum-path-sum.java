class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int dp[][]=new int[m][n];
        int s=grid[0][0];
        dp[0][0]=grid[0][0];
        for(int i=1;i<n;i++)
        {
            s+=grid[0][i];
            dp[0][i]=s;
        }
        s=grid[0][0];
        for(int i=1;i<m;i++)
        {
            s+=grid[i][0];
            dp[i][0]=s;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1]);
                dp[i][j]+=grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}