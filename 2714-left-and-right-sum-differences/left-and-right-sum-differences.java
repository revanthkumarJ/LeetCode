class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0;
        for(int i:nums){
            total+=i;
        }

        int curr=0;
        int n= nums.length;
        int res[]= new int[n];

        for(int i=0;i<n;i++){
            res[i]= Math.abs(total-nums[i]-curr);
            total= total - nums[i];
            curr= curr+nums[i];
        }

        return res;
    }
}