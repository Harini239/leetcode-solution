// Last updated: 8/12/2026, 11:20:20 AM
class Solution {
    public int hammingDistance(int x, int y) {
         int xor = x ^ y;

        int count = 0;

        while(xor != 0)
        {
            count += xor & 1;

            xor >>= 1;
        }

        return count;
    }
}