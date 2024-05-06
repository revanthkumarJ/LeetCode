class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(m*n!=r*c) return mat;
        int a=0,b=0;
        int res[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                try{
                    res[i][j]=mat[a][b];
                }
                catch(Exception e)
                {
                    return mat;
                }
                b++;
                if(b==n)
                {
                    a++;
                    b=0;
                }
            }
        }
        return  res;
    }
}