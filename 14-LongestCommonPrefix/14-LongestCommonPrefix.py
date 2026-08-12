# Last updated: 8/12/2026, 11:23:43 AM
class Solution:
    def longestCommonPrefix(self, strs):
        if not strs: return ""
        prefix = strs[0]
        for s in strs[1:]:
            while not s.startswith(prefix):
                prefix = prefix[:-1]
                if not prefix: return ""
        return prefix
