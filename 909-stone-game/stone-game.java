class Solution {
    
    public boolean stoneGame(int[] piles) {
        int a=0;
        int b=0;
        int res=1,ln=piles.length;
        for(int i=0;i<ln;i++){
            if(res%2!=0){
                a+=Math.max(piles[i],piles[ln-i-1]);
            }
            else{
                b+=Math.min(piles[i],piles[ln-i-1]);
            }
            res++;
        }
        return a>b;
    }
}