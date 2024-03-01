class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        o=0
        for i in s:
            if(i=='0'):
                o=o+1
        r="1"
        for i in range(0,o):
            r="0"+r
        for i in range(len(r),len(s)):
            r="1"+r
        return r