// Last updated: 8/12/2026, 11:18:22 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1));
        return x;
    }
}