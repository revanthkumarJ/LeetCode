class Solution {
    public int heightChecker(int[] heights) {
        int array[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            array[i]=heights[i];
        }
        Arrays.sort(array);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(array[i]!=heights[i])
            c++;
        }
        return c;
    }
}