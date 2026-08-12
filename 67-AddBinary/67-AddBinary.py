# Last updated: 8/12/2026, 11:23:03 AM
class Solution:
    def addBinary(self, a, b):
        result = []
        i, j = len(a) - 1, len(b) - 1
        carry = 0

        while i >= 0 or j >= 0 or carry:
            sum = carry
            if i >= 0:
                sum += int(a[i])
                i -= 1
            if j >= 0:
                sum += int(b[j])
                j -= 1

            result.append(str(sum % 2))
            carry = sum // 2

        return ''.join(reversed(result))
