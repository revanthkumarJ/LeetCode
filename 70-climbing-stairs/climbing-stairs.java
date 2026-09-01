class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int i=3;
        int a =1;
        int b=2;
        int c=0;
        while(i<=n){
            c= a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
}