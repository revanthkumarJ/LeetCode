class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currSum=nums[0];
        int start=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>currSum+nums[i]){
                currSum=nums[i];
                start=i;
            }else{
                currSum+=nums[i];
                while(start<i && currSum-nums[start]>currSum){
                currSum-=nums[start++];
            }
            }
            
            if(currSum>max)
            max=currSum;
        }
        return max;
    }
}