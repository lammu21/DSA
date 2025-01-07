//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n=arr.length;
        int dp[]= new int[n];
        // Arrays.fills(dp,-1);
        Arrays.fill(dp, -1); 
        
        return minCostHelper(n-1,arr,dp,k);
    }
    public static int minCostHelper(int ind,int[] height,int[] dp,int k){
        // if(ind<0){
        //     return 0;
        // }
        // // int minimum=Math.mi
        // int mmSteps = Integer.MAX_VALUE;
        
        // for(int j=1;j<=k;j++){
        //     if(ind-j>=0){
        //         int jump= minCostHelper(ind-j,heights,dp,k)+Math.abs(heights[ind] - heights[ind - j]);
        //         mmSteps=Math.min(mmSteps,jump);
        //         //  int jump = solveUtil(ind - j, height, dp, k) + Math.abs(heights[ind] - height[ind - j]);
        //         // mmSteps = Math.min(jump, mmSteps);
                
        //     }
        // }
        // return dp[ind]=mmSteps;
        
        // Base case: If we are at the beginning (index 0), no cost is needed.
        if (ind == 0)
            return 0;

        // If the result for this index has been previously calculated, return it.
        if (dp[ind] != -1)
            return dp[ind];

        int mmSteps = Integer.MAX_VALUE;

        // Loop to try all possible jumps from '1' to 'k'
        for (int j = 1; j <= k; j++) {
            // Ensure that we do not jump beyond the beginning of the array
            if (ind - j >= 0) {
                // Calculate the cost for this jump and update mmSteps with the minimum cost
                int jump = minCostHelper(ind - j, height, dp, k) + Math.abs(height[ind] - height[ind - j]);
                mmSteps = Math.min(jump, mmSteps);
            }
        }

        // Store the minimum cost for this index in the dp array and return it.
        return dp[ind] = mmSteps;
    }

}





//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends