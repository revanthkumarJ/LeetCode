class Solution {
    public int minBitFlips(int start, int goal) {
        if (start == goal) return 0 ;
        int maxi = Math.max(start, goal) ;
        int ans = 0 ;
        while (maxi!=0){
            if ((start & 1) != (goal & 1)) ans++ ;
            start >>= 1 ;
            goal >>= 1 ;
            maxi >>= 1 ;
        }
        return ans ;
    }
}