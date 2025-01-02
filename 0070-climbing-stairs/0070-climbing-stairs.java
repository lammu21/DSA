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

// Recursion With memoization
      public int climbStairs(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return climbStairsHelper(n,memo);

      }
      public int climbStairsHelper(int n,HashMap<Integer,Integer> memo){
          if(n<=1){
            return 1;
          }
          if(memo.containsKey(n)){
            return memo.get(n);
          }

          int result = climbStairsHelper(n-1,memo)+climbStairsHelper(n-2,memo);
          memo.put(n,result);
          
          return result;
      }
}