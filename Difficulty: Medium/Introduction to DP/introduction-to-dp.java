//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            long topDownans = obj.topDown(n);
            long bottomUpans = obj.bottomUp(n);
            if (topDownans != bottomUpans)
                System.out.println(-1);
            else
                System.out.println(topDownans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    private static final int MOD = 1000000007;

    static long topDown(int n) {
        // code here
        long ans[] = new long [n+1];
        Arrays.fill(ans,-1);
        return topDownhelper(n,ans);
        }
        
        static long topDownhelper(int n, long [] ans){
            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            
            if(ans[n]!=-1){
                return ans[n];
            }
        
      
ans[n]= (topDownhelper(n-1,ans)+topDownhelper(n-2,ans))%MOD;
          return ans[n];
            
        }
    
 static long bottomUp(int n) {
        // code here
        int prev=1;
        int prev2=0;
        
        for(int i =2;i<=n;i++){
            int current = (prev+prev2)%MOD;
            prev2=prev;
            prev=current;
        }
        
        return prev;
    }
    
 
    
}


// class Solution {
//     private static final int MOD = 1000000007;

//     // Top-Down Approach with Memoization
//     public long topDown(int n) {
//         long[] memo = new long[n + 1];
//         Arrays.fill(memo, -1);
//         return topDownHelper(n, memo);
//     }

//     private long topDownHelper(int n, long[] memo) {
//         if (n == 0) return 0;
//         if (n == 1) return 1;
//         if (memo[n] != -1) return memo[n];

//         memo[n] = (topDownHelper(n - 1, memo) + topDownHelper(n - 2, memo)) % MOD;
//         return memo[n];
//     }

//     // Bottom-Up Approach
//     public long bottomUp(int n) {
//         if (n == 0) return 0;
//         if (n == 1) return 1;

//         long[] dp = new long[n + 1];
//         dp[0] = 0;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
//         }

//         return dp[n];
//     }

   
// }

    
    
    
    
    
    
  

