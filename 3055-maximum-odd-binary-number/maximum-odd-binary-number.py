class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        o=0
        for i in s:
            if(i=='0'):
                o=o+1
        return ("1"*(len(s)-o-1))+("0"*o)+"1"