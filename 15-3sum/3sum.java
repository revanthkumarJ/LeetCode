class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            continue;
            int left=i+1,right=n-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    List<Integer> a=new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[left]);
                    a.add(nums[right]);
                    res.add(a);
                    left++;
                    while(left<n && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                }
                else if(nums[i]+nums[left]+nums[right]>0)
                right--;
                else
                left++;
            }
        }
        return res;
    }
}