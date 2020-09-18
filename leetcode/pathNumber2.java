class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int m=obstacleGrid.length,n=obstacleGrid[0].length;
      int[][] dp=new int[m][n];
      //给第一行第一列初始化，如果遇到障碍物，则后面所有格子都无法到达，退出循环
      for(int i=0;i<n&&obstacleGrid[0][i]==0;i++){
        dp[0][i]=1;
      }
      for(int i=0;i<m&&obstacleGrid[i][0]==0;i++){
        dp[i][0]=1;
      }
      for(int i=1;i<m;i++)
        for(int j=1;j<n;j++){
          if(obstacleGrid[i][j]==0)
            dp[i][j]=dp[i][j-1]+dp[i-1][j];
        }
      return dp[m-1][n-1];
    }
}
