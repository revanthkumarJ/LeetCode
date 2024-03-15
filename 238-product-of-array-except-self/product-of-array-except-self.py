class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p=1
        zero=0
        for i in nums:
            if(i!=0):
                p=p*i
            if(i==0):
                zero=zero+1
        l=[]
        for i in nums:
            if(zero>1):
                l.append(0)
            elif(i==0):
                l.append(int(p))
            elif(zero==1):
                l.append(0)
            else:
                l.append(int(p/i))
        return l
