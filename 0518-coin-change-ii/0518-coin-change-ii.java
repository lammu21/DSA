class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int [][] dp = new int [n][amount+1];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }

        return f(amount,coins,n-1,dp);
        
    }
    public int f(int amount, int [] coins,int ind,int[][] dp){

        if(ind==0){
            if(amount%coins[0]==0){
               return 1;
            }
            else {
                return 0;
            }
        }
        if(dp[ind][amount]!=-1){
            return dp[ind][amount];
        }

        int notTaken=f(amount,coins,ind-1,dp);
        int taken=0;

        if(coins[ind]<=amount){
            taken=f(amount-coins[ind],coins,ind,dp);
        }
        return dp[ind][amount] = notTaken+taken;

    }
}