import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i:row)
        {
            
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
        }
        for(int j:col)
        {
            for(int i=0;i<matrix.length;i++)
                {
                    matrix[i][j]=0;
                }
        }
        
    }
}