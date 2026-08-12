// Last updated: 8/12/2026, 11:23:27 AM
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);
    }
}
