// Last updated: 8/12/2026, 11:32:02 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        Map<Integer, Integer> freq = new HashMap<>();
4        int left = 0;
5        int maxLen = 0;
6        for (int right = 0; right < nums.length; right++) {
7            freq.merge(nums[right], 1, Integer::sum);
8            while (freq.get(nums[right]) > k) {
9                freq.merge(nums[left], -1, Integer::sum);
10                left++;
11            }
12            maxLen = Math.max(maxLen, right - left + 1);
13        }
14        return maxLen;
15    }
16}