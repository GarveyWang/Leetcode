package Leetcode.Array;

public class RotateImage {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; ++i) {
            rotate(matrix, i);
        }
    }

    public void rotate(int[][] matrix, int i) {
        int len = matrix.length - 2 * i - 1;
        for (int delta = 0; delta < len; ++delta) {
            int temp = matrix[i][i + delta];
            matrix[i][i + delta] = matrix[matrix.length - 1 - i - delta][i];
            matrix[matrix.length - 1 - i - delta][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - i - delta];
            matrix[matrix.length - 1 - i][matrix.length - 1 - i - delta] = matrix[i + delta][matrix.length - 1 - i];
            matrix[i + delta][matrix.length - 1 - i] = temp;
        }
    }
}
