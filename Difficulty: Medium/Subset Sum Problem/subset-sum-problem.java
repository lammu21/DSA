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

   static Boolean isSubsetSum(int arr[], int target) {
        int n=arr.length;
        int [][] memo= new int[n][target+1];
        for(int row[]:memo){
            Arrays.fill(row,-1);
        }
      return isSubsetSumHelper(n-1,arr,target,memo);
        // code here
    }
    // static Boolean isSubsetSumHelper(int ind,int[] arr, int target int[][] memo){
       static Boolean isSubsetSumHelper(int ind, int[] arr, int target, int[][] memo) {
        if(target==0) return true;
        if(ind==0) return arr[0]==target;
        
        if(memo[ind][target]!=-1){
            return memo[ind][target]==0 ? false:true;
        }
        
        boolean notTaken=isSubsetSumHelper(ind-1,arr,target,memo);
        boolean taken=false;
        if(arr[ind]<=target){
            taken=isSubsetSumHelper(ind-1,arr,target-arr[ind],memo);
        }
        memo[ind][target]=notTaken||taken?1:0;
        
        return notTaken||taken;
    }
}