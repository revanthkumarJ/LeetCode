class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int array[][]=new int[amount+1][n+1];
        for(int i=0;i<=amount;i++)
        {
            array[i][0]=0;
        }
        for(int i=0;i<=n;i++)
        {
            array[0][i]=1;
        }
        for(int i=1;i<=amount;i++)
        {
            
            for(int j=1;j<=n;j++)
            {
                array[i][j]=array[i][j-1];
                if(coins[j-1]<=i)
                array[i][j]=array[i][j]+array[i-coins[j-1]][j];
            
            }
            
        }
        return array[amount][n];
    }
}