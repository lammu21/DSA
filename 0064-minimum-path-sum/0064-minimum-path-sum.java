class Solution {


// Tabulation
public static int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int [][] dp= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                    dp[i][j]=grid[i][j];
                    }
                    else{
                        int up=grid[i][j];
                            if(i>0){
                                up+=dp[i-1][j];
                        }
                        else{
                              up+= (int) Math.pow(10, 9);
                        }
                        int right = grid[i][j];
                           if(j>0){
                            right+=dp[i][j-1];
                          }
                        else{
                            right+=(int) Math.pow(10, 9);
                        }
                          dp[i][j]= Math.min(up,right);
                    }
                   
                }
               
                
            }
               return dp[m-1][n-1];
         
        }
}
// Memoization
//     public static int minPathSum(int[][] grid) {
        
//         int m=grid.length;
//         int n=grid[0].length;
//         int [][] dp= new int [m][n];
//         for(int [] row:dp){
//             Arrays.fill(row,-1);
//         }
//         return f(m-1,n-1,grid,dp);
//     }

//     public static int f(int i, int j,int[][] grid, int [][] dp){
//         if(i==0&&j==0){
//             return grid[0][0];
//         }
//         if(i<0||j<0){
//             return  (int) Math.pow(10, 9);
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         int up=grid[i][j]+f(i-1,j,grid,dp);

//         int left=grid[i][j]+f(i,j-1,grid,dp);
//         return dp[i][j]=Math.min(up,left);
//     }
// }