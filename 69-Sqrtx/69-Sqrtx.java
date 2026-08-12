// Last updated: 8/12/2026, 11:22:56 AM
class Solution {
    public int mySqrt(int x) {
        long r=x;
        while(r*r>x){
            r=(r+x/r)/2;
        }
        return (int)r;
    }
}