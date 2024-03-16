class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        s=dict()
        s[0]=-1
        max=0
        sum=0
        for i in range(len(nums)):
            if(nums[i]==0):
                sum=sum-1
            else:
                sum=sum+1
            ele=s.get(sum,-2)
            if(ele==-2):
                s[sum]=i
            else:
                a=i-s[sum]
                if(a>max):
                    max=a
        return max