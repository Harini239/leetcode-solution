# Last updated: 8/12/2026, 11:22:15 AM
class Solution:
    def generate(self, numRows):
        result = []

        for i in range(numRows):
            row = [1] * (i + 1)  # Start with all 1s

            # Fill in the middle values
            for j in range(1, i):
                row[j] = result[i - 1][j - 1] + result[i - 1][j]

            result.append(row)

        return result
