//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int W = Integer.parseInt(in.readLine().trim());
            String line2[] = in.readLine().trim().split(" ");
            int N = line2.length;
            int val[] = new int[N];
            for (int i = 0; i < N; i++) val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split(" ");
            int wt[] = new int[N];
            for (int i = 0; i < N; i++) wt[i] = Integer.parseInt(line3[i]);

            Solution ob = new Solution();
            System.out.println(ob.knapSack(val, wt, W));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n= wt.length;
        
        int [][] dp= new int[n][capacity+1];
        
        for(int row[] :dp){
            Arrays.fill(row,-1);
        }
        
        return knapsackUtil(wt,val,n-1,capacity,dp);
        
    }
    
    static int knapsackUtil(int [] wt,int[] val,int ind, int W, int [][]dp){
        if(ind==0){
            return ((int)(W/wt[0]))*val[0];
            
        }
        if(dp[ind][W]!=-1){
            return dp[ind][W];
        }
        
        int notTaken =0+knapsackUtil(wt,val,ind-1,W,dp);
        
        int taken=Integer.MIN_VALUE;
        
        if(wt[ind]<=W){
            taken= val[ind]+knapsackUtil(wt,val,ind,W-wt[ind],dp);
            
           
        }
        
         return dp[ind][W]=Math.max(notTaken,taken);
        
    }
}