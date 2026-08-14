# Last updated: 8/14/2026, 12:28:01 PM
1class Solution:
2    def lengthOfLongestSubstring(self, s: str) -> int:
3        longest= ""
4        for i in range(len(s)):
5            sub=""
6            for j in range(i,len(s)):
7                if s[j] not in sub:
8                    sub+=s[j]
9                else:
10                     break
11            if len(sub)>len(longest):
12                longest=sub
13        return len(longest)