class Solution {

    public List<String> give(boolean[][] board, int n) {
        List<String> result = new ArrayList<>();

        for (boolean[] i : board) {
            StringBuilder re = new StringBuilder();

            for (boolean j : i) {
                if (j) {
                    re.append('Q');
                } else {
                    re.append('.');
                }
            }
            result.add(re.toString());
        }

        return result;
    }

    public boolean isafe(boolean[][] board, int row, int col, int n) {
        for (int i = 0; i < n; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[row][i]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public void nqueen(boolean[][] board, int row, int n, List<List<String>> ans) {
        if (row == n) {
            ans.add(give(board, n));
        }
        for (int i = 0; i < n; i++) {
            if (isafe(board, row, i, n)) {
                board[row][i] = true;
                nqueen(board, row + 1, n, ans);
                board[row][i] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        nqueen(board, 0, n, ans);
        return ans;
    }
}