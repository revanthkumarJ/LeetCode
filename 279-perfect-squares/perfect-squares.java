class Solution {
    
    public int numSquares(int n) {
         int[] array = new int[n + 1];
        Arrays.fill(array, Integer.MAX_VALUE);
        array[0] = 0;
        for (int i = 1; i <= n; ++i) {
            int min_val = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; ++j) {
                min_val = Math.min(min_val, array[i - j * j] + 1);
            }
            array[i] = min_val;
        }
        return array[n];
    }
}