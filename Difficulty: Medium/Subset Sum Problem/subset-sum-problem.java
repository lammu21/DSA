//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input_line[] = read.readLine().trim().split("\\s+");
            int N = input_line.length;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if (ob.isSubsetSum(arr, sum))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    // Tabulation
      static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int n= arr.length;
        
        boolean [][] dp= new boolean [n][target+1];
        
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        
        if(arr[0]<=target){
            dp[0][arr[0]]=true;
        }
        
        for(int ind=1;ind<n;ind++){
            for(int tar=1;tar<=target;tar++){
                
                
                 boolean notTaken=dp[ind-1][tar];
                 
                 boolean taken=false;
                 if(arr[ind]<=tar){
                     taken =dp[ind-1][tar-arr[ind]];
                 }
                 dp[ind][tar]=taken||notTaken;
            }
        }
        return dp[n-1][target];
        
    }
  
}