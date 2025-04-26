class Solution {
    // public int maxProfit(int[] prices) {
    //     int n=prices.length;

    //     int[][]dp= new int [n+1][2];

    //     for(int[] row: dp){
    //         Arrays.fill(row,-1);
    //     }

    //     return maxHelper(prices,n,0,0,dp);
        
    // }

    public static int maxHelper(int []price,int n, int ind, int buy,int[][]dp){
        if(ind==n){
            return 0;
        }

        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }


         int profit=0;
        if(buy==0){
           profit= Math.max(0+maxHelper(price,n,ind+1,0,dp),
                    -price[ind]+maxHelper(price,n,ind+1,1,dp));
        }
        else{
            profit= Math.max(0+maxHelper(price,n,ind+1,1,dp),
                    price[ind]+maxHelper(price,n,ind+1,0,dp));
        }
         return dp[ind][buy]=profit;

        }

   
   


       public int maxProfit(int[] price) {
        int n=price.length;

        int[][]dp= new int [n+1][2];

        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){

                if(buy==0){
                   dp[ind][buy]= Math.max(0+dp[ind+1][0],
                                      -price[ind]+dp[ind+1][1]);
                }
                else{
                   dp[ind][buy]= Math.max(0+dp[ind+1][1],
                                      price[ind]+dp[ind+1][0]);
               }
            }
        }
        return dp[0][0];
   
    
    }
}


