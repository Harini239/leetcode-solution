// Last updated: 8/14/2026, 2:01:16 PM
1import java.util.ArrayList;
2import java.util.List;
3class Solution {
4    public List<String> summaryRanges(int[] nums) {
5        List<String> result = new ArrayList<>();
6        if (nums.length == 0) return result;
7        int start = nums[0];
8        for (int i = 1; i <= nums.length; i++) {
9            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
10                if (start == nums[i - 1]) {
11                    result.add(String.valueOf(start));
12                } else {
13                    result.add(start + "->" + nums[i - 1]);
14                }
15                if (i < nums.length) start = nums[i];
16            }
17        }
18        return result;
19    }
20}