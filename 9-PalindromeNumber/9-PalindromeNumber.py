# Last updated: 8/12/2026, 11:23:54 AM
class Solution:
    def isPalindrome(self, x):
        if x < 0:
            return False
        return str(x) == str(x)[::-1]
