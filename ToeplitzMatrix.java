package Leetcode;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int i=matrix.length-1;
        while (i>=0){
            int jj=0;
            int k=matrix[i][0];
            for (int ii=i;ii<matrix.length && jj<matrix[0].length;++ii,++jj){
                if (matrix[ii][jj]!=k){
                    return false;
                }
            }
            --i;
        }
        int j=1;
        while (j<matrix[0].length){
            int ii=0;
            int k=matrix[0][j];
            for (int jj=j;jj<matrix[0].length && ii<matrix.length;++jj,++ii){
                if (matrix[ii][jj]!=k){
                    return false;
                }
            }
            ++j;
        }
        return true;
    }
}
