// Last updated: 8/12/2026, 11:23:31 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) if (num != val) nums[k++] = num;
        return k;
    }
}
