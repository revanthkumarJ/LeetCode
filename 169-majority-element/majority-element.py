class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=len(nums)
        s=dict()
        for i in nums:
            a=s.get(i,0)+1
            if(a>=(n/2)):
                return i
            s[i]=a
        return -1