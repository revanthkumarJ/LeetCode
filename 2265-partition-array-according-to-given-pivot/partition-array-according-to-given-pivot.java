class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l=0;
        int p=0;
        for(int i:nums)
        {
            if(i<pivot)
            l++;
            else if(i==pivot)
            p++;
        }
        int en=l+p;
        p=l;
        l=0;
        int res[]=new int[nums.length];
        for(int i:nums)
        {
            if(i<pivot)
            res[l++]=i;
            else if(i==pivot)
            res[p++]=i;
            else
            res[en++]=i;
        }
        return res;

    }
}