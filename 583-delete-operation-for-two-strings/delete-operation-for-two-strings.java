class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length(),n=word2.length();
        int array[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            array[i][0]=i;
        }
        for(int i=0;i<=n;i++)
        {
            array[0][i]=i;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                array[i][j]=array[i-1][j-1];
                else
                array[i][j]=1+(int)Math.min(array[i-1][j],array[i][j-1]);
            }
        }
        return array[m][n];
    }
}