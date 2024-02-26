class Solution:
    def isPalindrome(self, x: int) -> bool:
        r=str(x)[::-1]
        if(str(x)==r):
            return True
        return False
        