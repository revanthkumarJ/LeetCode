class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row[]=new int[matrix.length];
        Arrays.fill(row,Integer.MAX_VALUE);
        int col[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                row[i]=(int)Math.min(row[i],matrix[i][j]);
                col[j]=(int)Math.max(col[j],matrix[i][j]);
            }
        }
        List<Integer> array=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(row[i]==col[j])
                array.add(row[i]);
            }
        }
        return array;
    }
}