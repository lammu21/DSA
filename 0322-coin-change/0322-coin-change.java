class Solution {
    public int coinChange(int[] coins, int amount) {
           int n= coins.length;

           int [][] memo= new int [n+1][amount+1];

           for(int [] row : memo ){
            Arrays.fill(row,-1);
           }

           int result = f(n-1,coins,amount,memo);

           if(result >= (int) Math.pow(10, 9)){
              return -1;
           }
           return result;
    }
    public int f(int ind,int [] coins, int amount,int [][]dp){
        if(ind==0){
            if(amount%coins[0]==0)
                return amount/coins[0];
            
            else
                return (int) Math.pow(10,9);
            
        }

        if(dp[ind][amount]!=-1){
            return dp[ind][amount];
        }
        int notTaken = 0+f(ind-1,coins,amount,dp);

        int taken =(int) Math.pow(10,9);

        if(coins[ind]<=amount){
            taken = 1+f(ind,coins,amount-coins[ind],dp);
        }
        return dp[ind][amount]=Math.min(notTaken,taken);


    }
}