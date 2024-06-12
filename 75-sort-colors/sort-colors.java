class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            a++;
            else if(nums[i]==1)
            b++;
            else
            c++;
        }
        int i=0,j=nums.length-1;
        while(a!=0 && c!=0)
        {
            nums[i++]=0;
            nums[j--]=2;
            a--;
            c--;
        }
        while(a!=0)
        {
            nums[i++]=0;
            a--;
        }
        while(c!=0)
        {
            nums[j--]=2;
            c--;
        }
        while(b!=0)
        {
            nums[i++]=1;
            b--;
        }
        
    }
}