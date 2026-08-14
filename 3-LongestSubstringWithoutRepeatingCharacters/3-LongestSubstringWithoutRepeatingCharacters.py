# Last updated: 8/14/2026, 12:31:18 PM
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        longest= ""
        for i in range(len(s)):
            sub=""
            for j in range(i,len(s)):
                if s[j] not in sub:
                    sub+=s[j]
                else:
                     break
            if len(sub)>len(longest):
                longest=sub
        return len(longest)