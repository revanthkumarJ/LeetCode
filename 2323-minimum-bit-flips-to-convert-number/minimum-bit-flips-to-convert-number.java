class Solution {
    public int minBitFlips(int start, int goal) {
        if (start == goal) return 0 ;
        int ans = 0 ;
        while (start!=0 && goal!=0){
            if ((start & 1) != (goal & 1)) ans++ ;
            start >>= 1 ;
            goal >>= 1 ;
        }
        while(start!=0)
        {
            if((start&1)!=0)
                ans++;
                start>>=1;
        }
         while(goal!=0)
        {
            if((goal&1)!=0)
                ans++;
                goal>>=1;
        }
        
        return ans ;
    }
}