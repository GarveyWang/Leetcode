package Leetcode;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix==null){
            return false;
        }
        int[]array = new int[matrix.length+matrix[0].length-1];
        int i=0;
        for (int j=matrix.length-1;j>=0;--j){
            array[i++]=matrix[j][0];
        }
        for (int j=1;j<matrix[0].length;++j){
            array[i++]=matrix[0][j];
        }

        i=0;
        for (int j=matrix.length-1;j>=0;--j){
            for (int k=0;k<matrix[0].length;++k){
                if(matrix[j][k]!=array[i+k]) {
                    return false;
                }
            }
            ++i;
        }
        return true;
    }
}
