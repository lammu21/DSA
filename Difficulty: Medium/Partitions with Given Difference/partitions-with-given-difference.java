//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countPartitions(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // static int mod=(int) (Math.pow(10,9)+7)
    int countPartitions(int[] arr, int d) {
            // code here
        int n = arr.length;
        int totSum=0;
        
        for(int i =0;i<arr.length;i++){
			totSum+=arr[i];
		}
            if((totSum-d)<0 ||(totSum-d)%2==1) return 0;
            
            int S2=(totSum-d)/2;
            int dp[][] = new int [n][S2+1];
            
            for(int row[] :dp)
                Arrays.fill(row,-1);
        return f(n-1,S2,arr,dp);
    }
    static int f(int ind, int target,int[] arr,int [][]dp){
        if(ind==0){
            if(target ==0&&arr[0]==0){
                return 2;
            }
            if(target==0||target==arr[0]){
                return 1;
            }
            return 0;
        }
        
        if(dp[ind][target]!=-1){
            return dp[ind][target];
        }
        
        int notTaken=f(ind-1,target,arr,dp);
        
        int taken=0;
        if(arr[ind]<=target){
            taken=f(ind-1,target-arr[ind],arr,dp);
        }
        return dp[ind][target]=notTaken+taken;
    }
    
    
    
}
