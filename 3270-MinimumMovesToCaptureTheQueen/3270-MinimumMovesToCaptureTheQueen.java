// Last updated: 8/12/2026, 11:17:26 AM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (a == e && !(a == c && between(b, d, f))) return 1;                  // -
        if (b == f && !(b == d && between(a, c, e))) return 1;                  // |
        if (c + d == e + f && !(c + d == a + b && between(c, a, e))) return 1;  // diag /
        if (d - c == f - e && !(d - c == b - a && between(c, a, e))) return 1;  // diag \           // diag \
        return 2;
    }

    public boolean between(int l, int mid, int r) {
        return mid > Math.min(l, r) && mid < Math.max(l, r); 
    }
}