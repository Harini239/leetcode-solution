# Last updated: 8/12/2026, 11:23:36 AM
class Solution:
    def removeDuplicates(self, nums):
        if not nums:
            return 0

        k = 1  

        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[k] = nums[i]
                k += 1

        return k
