// Last updated: 8/12/2026, 11:17:22 AM
class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++)
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));

        return score;
    }
}