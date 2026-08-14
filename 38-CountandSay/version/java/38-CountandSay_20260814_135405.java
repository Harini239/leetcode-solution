// Last updated: 8/14/2026, 1:54:05 PM
1class Solution {
2    public String RLE(String sequence) {
3        StringBuilder sb = new StringBuilder();
4        char[] nums = sequence.toCharArray();
5        char curr = nums[0];
6        int count = 0;
7        for (char num : nums) {
8            if (num == curr)
9                count++;
10            else {
11                sb.append(count);
12                sb.append(curr);
13                curr = num;
14                count = 1;
15            }
16        }
17        sb.append(count);
18        sb.append(curr);
19        return sb.toString();
20    }
21    public String countAndSay(int n) {
22        if (n == 1)
23            return "1"; 
24        return RLE(countAndSay(n - 1));
25    }
26}