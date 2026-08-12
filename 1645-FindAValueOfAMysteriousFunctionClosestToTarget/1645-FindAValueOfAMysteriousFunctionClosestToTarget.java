// Last updated: 8/12/2026, 11:18:48 AM
import java.util.*;

class Solution {
    public int closestToTarget(int[] arr, int target) {
        Set<Integer> prev = new HashSet<>();
        int ans = Integer.MAX_VALUE;

        for (int num : arr) {
            Set<Integer> curr = new HashSet<>();
            curr.add(num);
            for (int p : prev) {
                curr.add(p & num);
            }
            for (int val : curr) {
                ans = Math.min(ans, Math.abs(val - target));
            }
            prev = curr;
        }

        return ans;
    }
}
