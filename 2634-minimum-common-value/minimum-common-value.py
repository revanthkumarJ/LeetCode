class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        i=0
        j=0
        m=len(nums1)
        n=len(nums2)
        while(i<m and j<n):
            if(nums1[i]==nums2[j]):
                return nums1[i]
            elif (nums1[i]<nums2[j]):
                i=i+1
            else:
                j=j+1
        return -1