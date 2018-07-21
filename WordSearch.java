package Leetcode;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] used = new boolean[board.length][board[0].length];
                    used[i][j] = true;
                    if (dfs(board, word, used, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, boolean[][] used, int i, int j, int k) {
        if (k == word.length() - 1) {
            return true;
        }
        if ((i + 1 < board.length) && (!used[i + 1][j]) && (board[i + 1][j] == word.charAt(k + 1))) {
            used[i + 1][j] = true;
            if (dfs(board, word, used, i + 1, j, k + 1)) {
                return true;
            }
            used[i + 1][j] = false;
        }
        if ((i - 1 >= 0) && (!used[i - 1][j]) && (board[i - 1][j] == word.charAt(k + 1))) {
            used[i - 1][j] = true;
            if (dfs(board, word, used, i - 1, j, k + 1)) {
                return true;
            }
            used[i - 1][j] = false;
        }
        if ((j + 1 < board[0].length) && (!used[i][j + 1]) && (board[i][j + 1] == word.charAt(k + 1))) {
            used[i][j + 1] = true;
            if (dfs(board, word, used, i, j + 1, k + 1)) {
                return true;
            }
            used[i][j + 1] = false;
        }
        if ((j - 1 >= 0) && (!used[i][j - 1]) && (board[i][j - 1] == word.charAt(k + 1))) {
            used[i][j - 1] = true;
            if (dfs(board, word, used, i, j - 1, k + 1)) {
                return true;
            }
            used[i][j - 1] = false;
        }
        return false;
    }

}
