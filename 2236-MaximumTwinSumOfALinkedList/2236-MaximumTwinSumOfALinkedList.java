// Last updated: 8/12/2026, 11:18:11 AM
import java.util.ArrayList;

class Solution {
    public int pairSum(ListNode head) {

        
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size() - 1;

        int maxSum = 0;

        while (left < right) {

            int twinSum = list.get(left) + list.get(right);

            if (twinSum > maxSum) {
                maxSum = twinSum;
            }

            left++;
            right--;
        }

        return maxSum;
    }
}