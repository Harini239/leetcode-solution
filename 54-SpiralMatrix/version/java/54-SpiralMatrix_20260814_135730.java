// Last updated: 8/14/2026, 1:57:30 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        int x = 0;
6        int y = 0;
7        int dx = 1;
8        int dy = 0;
9        List<Integer> res = new ArrayList<>();
10        for (int i = 0; i < rows * cols; i++) {
11            res.add(matrix[y][x]);
12            matrix[y][x] = -101; 
13            if (!(0 <= x + dx && x + dx < cols && 0 <= y + dy && y + dy < rows) || matrix[y+dy][x+dx] == -101) {
14                int temp = dx;
15                dx = -dy;
16                dy = temp;
17            }
18            x += dx;
19            y += dy;
20        }
21        return res;        
22    }
23}