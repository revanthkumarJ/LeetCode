class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        o=s.count("0")
        return ("1"*(len(s)-o-1))+("0"*o)+"1"