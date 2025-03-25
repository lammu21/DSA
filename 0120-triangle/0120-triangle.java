class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][] dp = new int [n][n];

         for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return f(0,0,n,triangle,dp);

        
    }
    public static int f(int i,int j,int n,List<List<Integer>> triangle,int [][]dp){
       if(dp[i][j]!=-1){
            return dp[i][j];
       }

        if(i==n-1){
            return triangle.get(i).get(j);
        }
   
        int down =triangle.get(i).get(j)+f(i+1,j,n,triangle,dp);
        int diagonal = triangle.get(i).get(j)+f(i+1,j+1,n,triangle,dp);
       
       return dp[i][j] = Math.min(down, diagonal);

    }
}