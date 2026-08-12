// Last updated: 8/12/2026, 11:18:37 AM
class Solution {
    public boolean check(int[] nums) {
        int breaks = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breaks++;
            }
        }

        return breaks <= 1;
    }
}