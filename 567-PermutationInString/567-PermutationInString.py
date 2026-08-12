# Last updated: 8/12/2026, 11:19:56 AM
from collections import Counter
class Solution:
    def checkInclusion(self, s1, s2):
        n = len(s1)
        for i in range(len(s2) - n + 1):
            if Counter(s2[i:i+n]) == Counter(s1):
                return True
        return False