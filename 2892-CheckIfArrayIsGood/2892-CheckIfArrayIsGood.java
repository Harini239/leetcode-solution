// Last updated: 8/12/2026, 11:17:38 AM
class Solution {
    public boolean isGood(int[] nums) {
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        if (nums.length != mx + 1)
            return false;
        int[] freq = new int[mx + 1];
        for (int x : nums) {
            if (x < 1 || x > mx)
                return false;
            freq[x]++;
        }
        for (int i = 1; i < mx; i++) {
            if (freq[i] != 1)
                return false;
        }
        return freq[mx] == 2;
    }
}