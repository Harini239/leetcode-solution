// Last updated: 8/12/2026, 11:20:21 AM
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}