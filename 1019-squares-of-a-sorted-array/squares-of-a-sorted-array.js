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
        
        if(Math.abs(nums[low])>Math.abs(nums[high]))
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