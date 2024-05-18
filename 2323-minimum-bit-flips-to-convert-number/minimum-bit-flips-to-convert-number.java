class Solution {
    public int minBitFlips(int start, int goal) {
        String a=Integer.toBinaryString(start);
        String b=Integer.toBinaryString(goal);
        System.out.println(a+" "+b);
        int i=a.length()-1,j=b.length()-1;
        int t=0;
        while(i>=0 && j>=0)
        {
            if(a.charAt(i)!=b.charAt(j))
            t++;
            i--;
            j--;
        }
        while(i>=0)
        {
            if(a.charAt(i)=='1')
            t++;
            i--;
        }
        while(j>=0)
        {
            if(b.charAt(j)=='1')
            t++;
            j--;
        }
        return t;
    }
}