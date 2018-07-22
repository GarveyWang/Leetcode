package Leetcode.Array;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int i = 0,j = 0;
        int direction = 0;
        for (int num=1;num<=n*n;++num){
            result[i][j] = num;
            switch (direction){
                case 0:
                    if(j==n-1||result[i][j+1]!=0){
                        ++i;
                        direction = 1;
                    }else{
                        ++j;
                    }
                    break;
                case 1:
                    if(i==n-1||result[i+1][j]!=0){
                        --j;
                        direction = 2;
                    }else{
                        ++i;
                    }
                    break;
                case 2:
                    if(j==0||result[i][j-1]!=0){
                        --i;
                        direction = 3;
                    }else{
                        --j;
                    }
                    break;
                case 3:
                    if(i==n-1||result[i-1][j]!=0){
                        ++j;
                        direction = 0;
                    }else{
                        --i;
                    }
                    break;
            }
        }
        return result;
    }
}
