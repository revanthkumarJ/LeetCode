class Solution {
    public boolean check(int[] nums) {
        int great=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n])
            great++;
        }

        return great<=1;
    }
}