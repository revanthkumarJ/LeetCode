class Solution {
    public void bfs(char grid[][],int r,int c)
    {
        
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)return ;
        if(grid[r][c]=='0')return ;
        grid[r][c]='0';
        bfs(grid,r+1,c);
        bfs(grid,r,c+1);
        bfs(grid,r-1,c);
        bfs(grid,r,c-1);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        int res=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    res++;
                    bfs(grid,i,j);
                }
            }
        }
        return res;
    }
}