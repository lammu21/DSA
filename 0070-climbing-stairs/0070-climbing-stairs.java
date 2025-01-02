class Solution {

// Recursion
    // public int climbStairs(int n) {
      
    //     if(n==0){
    //         return 1;
    //     }if(n==1){
    //         return 1;
    //     }
        
    //     return climbStairs(n-1)+climbStairs(n-2);
    // }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------
// Recursion With memoization
    //   public int climbStairs(int n) {
    //     HashMap<Integer, Integer> memo = new HashMap<>();
    //     return climbStairsMemo(n,memo);

    //   }
    //   public int climbStairsMemo(int n,HashMap<Integer,Integer> memo){
    //       if(n<=1){
    //         return 1;
    //       }
    //       if(memo.containsKey(n)){
    //         return memo.get(n);
    //       }

    //       int result = climbStairsMemo(n-1,memo)+climbStairsMemo(n-2,memo);
    //       memo.put(n,result);
          
    //       return result;
    //   }


//  ------------------------------------------------------------------------------------------------------------------------------------------------------------
// Tabulation Approach
   public int climbStairs(int n) {
      return climbStairTab(n);
   }

  public int climbStairTab(int n){

    if (n <= 1) return 1;
    int [] dp= new int [n+1];
     dp[0]=1;
     dp[1]=1;
    for(int i =2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
   }
}


