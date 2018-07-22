package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] used = new boolean[rows][cols];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0, c = 0, di = 0, count = rows * cols;
        while (count > 0) {
            res.add(matrix[r][c]);
            used[r][c] = true;
            int nextR = r + dr[di];
            int nextC = c + dc[di];
            if (0 <= nextR && nextR < rows && 0 <= nextC && nextC < cols && !used[nextR][nextC]) {
                r = nextR;
                c = nextC;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
            --count;
        }
        return res;
    }
}
