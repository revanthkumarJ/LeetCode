class Solution {
    public int len(int n)
    {
        return (n+"").length();
    }
    public int[] findColumnWidth(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int array[]=new int[c];
        for(int j=0;j<c;j++)
        {
            int max=0;
            for(int i=0;i<r;i++)
            {
                int rr=len(grid[i][j]);
                if(rr>max)
                max=rr;
            }
            array[j]=max;
        }
        return array;
    }
}