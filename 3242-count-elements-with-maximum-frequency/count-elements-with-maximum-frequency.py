class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        m={}
        max=0
        for i in nums:
            m[i]=m.get(i,0)+1
            if(m[i]>max):
                max=m[i]
        count=0
        for i in m.values():
            if(i==max):
                count=count+1
        return count*max