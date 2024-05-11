class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int min=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int left=i+1,right=n-1;
            while(left<right)
            {
                int r=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-r)<Math.abs(target-min))
                min=r;
                if(r==target)return target;
                else if(r>target)
                right--;
                else
                left++;
            }
        }
        return min;
        
    }
}