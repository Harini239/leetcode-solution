// Last updated: 8/12/2026, 11:19:17 AM
public class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }
}
