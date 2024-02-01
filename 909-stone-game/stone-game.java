class Solution {
    
    public boolean stoneGame(int[] piles) {
        int alice=0;
        int bob=0;
        int num=1;
        int start=0;
        int end=piles.length-1;
        while(start<=end){
            if(num%2!=0){
             if(piles[start]>=piles[end]){
                 alice+=piles[start];
                 start++;
             }
             else{
                 alice+=piles[end];
                 end--;
             }
            }
            else{
               if(piles[start]>=piles[end]){
                 bob+=piles[end];
                 end--;
             }
             else{
                 alice+=piles[start];
                 start++;
             }
            }
            num++;
        }
       return alice>bob;
    }
}