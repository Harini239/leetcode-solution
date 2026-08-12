// Last updated: 8/12/2026, 11:19:16 AM
public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] coords1 = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(sol.checkStraightLine(coords1)); // true

        int[][] coords2 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(sol.checkStraightLine(coords2)); // false
    }
}

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
}
