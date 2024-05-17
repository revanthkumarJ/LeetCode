class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        if(arr[0][0]==1)return 0;
        int m=arr.length,n=arr[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)continue;
                if(i-1>=0 && j-1>=0)
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                else if(i-1>=0)
                dp[i][j]=dp[i-1][j];
                else if(j-1>=0)
                dp[i][j]=dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}