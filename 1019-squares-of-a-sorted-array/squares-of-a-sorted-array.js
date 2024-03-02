/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    let array=[];
    let low=0,high=nums.length-1;
    while(low<=high)
    {
        if(nums[low]<0)
        nums[low]=-nums[low]
        if(nums[high]<0)
        nums[high]=-nums[high]
        if(nums[low]>nums[high])
        {
            array.unshift(nums[low]*nums[low]);
            low++;
        }
        else
        {
            array.unshift(nums[high]*nums[high]);
            high--;
        }
    }
    return array;
};