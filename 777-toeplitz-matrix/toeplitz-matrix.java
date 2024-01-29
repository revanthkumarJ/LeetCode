class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        HashMap<Integer,Integer> array=new HashMap<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int v=(m+n)-i+j;
                if(array.containsKey(v))
                {
                    if(matrix[i][j]!=array.get(v))
                    return false;
                }
                else
                array.put(v,matrix[i][j]);
            }
        }
        return true;
    }
}