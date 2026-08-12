# Last updated: 8/12/2026, 11:20:12 AM
class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        res = ""
        count = 0

        for c in s[::-1]:
            if c != "-":
                if count == k:
                    res = "-" + res
                    count = 0
                res = c.upper() + res
                count += 1

        return res