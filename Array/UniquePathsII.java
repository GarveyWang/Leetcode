package Leetcode.Array;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0) {
            return 0;
        }
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0;i<rows;++i){
            for (int j=0;j<cols;++j){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else if(i==0&&j==0){
                    dp[i][j]=1;
                }else if(i==0){
                    dp[i][j]=dp[i][j-1];
                }else if(j==0){
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[rows-1][cols-1];
    }
}
