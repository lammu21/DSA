class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int [][] dp = new int [n][amount+1];
        for(int tar=0;tar<=amount;tar++){
            if(tar%coins[0]==0){
                dp[0][tar]=1;
            }
        }
        for(int ind=1;ind<n;ind++){
            for(int tar=0;tar<=amount;tar++){
                int notTaken=dp[ind-1][tar];


                int taken=0;
                if(coins[ind]<=tar){
                    taken=dp[ind][tar-coins[ind]];
                }
                dp[ind][tar]=taken+notTaken;
            }

        }
        return dp[n-1][amount];
        
    }
}