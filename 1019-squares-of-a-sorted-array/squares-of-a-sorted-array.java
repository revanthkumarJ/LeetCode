class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int start=0,end=n-1;
        int array[]=new int[n];
        n--;
        while(start<=end)
        {
            if(Math.abs(nums[start])>Math.abs(nums[end]))
            {
                array[n--]=nums[start]*nums[start];
                start++;
            }
            else
            {
                array[n--]=nums[end]*nums[end];
                end--;
            }
        }
        return array;

    }
}