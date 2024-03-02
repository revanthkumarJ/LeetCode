
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n=len(nums)
        array=[0]*n
        low=0
        high=n-1
        n=n-1
        while(low<=high):
            if(abs(nums[low])>abs(nums[high])):
                array[n]=nums[low]*nums[low]
                low=low+1
            else:
                array[n]=nums[high]*nums[high]
                high=high-1
            n=n-1
            
        return array