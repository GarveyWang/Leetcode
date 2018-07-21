package Leetcode;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if(A==null){
            return null;
        }
        int[][] B = new int[A[0].length][A.length];
        for(int i=0;i<B.length;++i){
            for (int j=0;j<B[0].length;++j){
                B[i][j]=A[j][i];
            }
        }
        return B;
    }
}
