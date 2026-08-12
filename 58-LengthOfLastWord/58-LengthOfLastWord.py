# Last updated: 8/12/2026, 11:23:09 AM
class Solution:
    def lengthOfLastWord(self, s):
        words = s.strip().split()
        return len(words[-1])
sol = Solution()
print(sol.lengthOfLastWord("Hello World"))                   # Output: 5
print(sol.lengthOfLastWord("   fly me   to   the moon  "))   # Output: 4
print(sol.lengthOfLastWord("luffy is still joyboy"))         # Output: 6
