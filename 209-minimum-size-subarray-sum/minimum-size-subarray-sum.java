class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=0;
        int currSum=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum==target){
                int currLen=i-start+1;
                if(min==0 || min>currLen)
                min=currLen;
            }
            else if(currSum>target){
                while(currSum>target){
                    int currLen=i-start+1;
                    if(min==0 || min>currLen)
                         min=currLen;
                    currSum-=nums[start];
                    start++;
                    if(currSum==target){
                        currLen=i-start+1;
                        if(min==0 || min>currLen)
                            min=currLen;
                    }
                }
            }
        }
        return min;
    }
}