class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++)
        {
            
            if(i!=0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int left=j+1,right=n-1;
                while(left<right)
                {
                    long r=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(r==target)
                    {
                        List<Integer> aa=new ArrayList<>();
                        aa.add(nums[i]);
                        aa.add(nums[j]);
                        aa.add(nums[left]);
                        aa.add(nums[right]);
                        res.add(aa);
                        left++;
                        while(left<n && nums[left]==nums[left-1])
                        {
                            left++;
                        }
                    }
                    else if(r>target)
                    right--;
                    else
                    left++;
                }
            }
        }
        return res;
    }
}