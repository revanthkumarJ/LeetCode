/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    let array=new Array(nums.length);
    let low=0,high=nums.length-1;
    let ind=high;
    while(low<=high)
    {
        if(nums[low]<0)
        nums[low]=-nums[low]
        if(nums[high]<0)
        nums[high]=-nums[high]
        if(nums[low]>nums[high])
        {
            array[ind]=(nums[low]*nums[low]);
            low++;
        }
        else
        {
            array[ind]=(nums[high]*nums[high]);
            high--;
        }
        ind--;
    }
    return array;
};