// Last updated: 8/12/2026, 11:20:07 AM
class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        for (int x : machines) sum += x;
        if (sum % machines.length != 0) return -1;
        int avg = sum / machines.length;
        int ans = 0, bal = 0;
        for (int x : machines) {
            bal += x - avg;
            ans = Math.max(ans, Math.max(Math.abs(bal), x - avg));
        }
        return ans;
    }
}