class Solution {
    public int majorityElement(int[] nums) {
        
        int max=0,size=nums.length;
        int frequency[]=new int[size];
        for(int i=0;i<size;i++)
        {
            if(frequency[i]!=-1){
                int c=1;
                for(int j=i+1;j<size;j++)
                {
                    if(nums[i]==nums[j]){
                        frequency[j]=-1;
                        c++;
                    }
                }
                frequency[i]=c;
                if(frequency[i]>frequency[max])
                max=i;
            }
        }
        return nums[max];
        
    }
}