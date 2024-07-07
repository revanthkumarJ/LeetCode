class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=0;
        int full=numBottles;
        int empty=0;
        while(full>0)
        {
            res+=full;
            empty+=full;
            full=empty/numExchange;
            empty=empty-full*numExchange;
        }
        return res;
    }
}