class Solution {
    public int minimumLength(String s) {
        int low=0,high=s.length()-1;
        while(low<high)
        {
            char a=s.charAt(low);
            if(a!=s.charAt(high))
            {
                break;
            }
            while(low<=high && s.charAt(low)==a)
            {
                low++;
            }
            while(low<=high && s.charAt(high)==a)
            {
                high--;
            }
        }
        if(low>high)
        return 0;
        return high-low+1;
    }
}