class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low=0,high=people.length-1;
        int res=0;
        while(low<high)
        {
            if(people[low]+people[high]<=limit)
            {
                res++;
                low++;
                high--;
            }
            else
            {
                res++;
                high--;
            }
        }
        if(low==high)
        res++;
        return res;
    }
}