// Last updated: 8/12/2026, 11:22:50 AM
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] w = word.toCharArray();
        int[] freq = new int[128];
        for(char[] row : board)
        {
            for(char c : row)
            {
                freq[c]++;
            }
        }
        for(char c : w)
        {
            if(--freq[c] < 0)
                return false;
        }
        int first = 0;
        int last = w.length - 1;
        int firstCount = 0;
        int lastCount = 0;
        for(char[] row : board)
        {
            for(char c : row)
            {
                if(c == w[first]) firstCount++;
                if(c == w[last]) lastCount++;
            }
        }
        if(lastCount < firstCount)
        {
            int l = 0;
            int r = w.length - 1;
            while(l < r)
            {
                char temp = w[l];
                w[l] = w[r];
                w[r] = temp;
                l++;
                r--;
            }
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(board[i][j] == w[0] && dfs(board, w, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, char[] w, int i, int j, int idx)
    {
        if(idx == w.length)
            return true;

        if(i < 0 || j < 0 ||
           i >= board.length ||
           j >= board[0].length ||
           board[i][j] != w[idx])
            return false;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean ans =
                dfs(board, w, i + 1, j, idx + 1) ||
                dfs(board, w, i - 1, j, idx + 1) ||
                dfs(board, w, i, j + 1, idx + 1) ||
                dfs(board, w, i, j - 1, idx + 1);
        board[i][j] = temp;
        return ans;
    }
}