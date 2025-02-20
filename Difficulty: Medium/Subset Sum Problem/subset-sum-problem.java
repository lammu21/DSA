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
           // code here
        int n=arr.length;
        
        int [][] memo= new int [n][target+1];
        
        for(int [] row :memo){
            Arrays.fill(row,-1);
        }
        
        return f(n-1,arr,target,memo);
        
     
    }
    static Boolean f(int ind,int [] arr,int target,int [][] memo){
        if(target==0) return true;
        if(ind==0){
            return arr[0]==target;
        }
        
        if(memo[ind][target]!=-1){
            // Mistake not used ternary operate
            return memo[ind][target] ==0? false:true;
        }
        
        boolean notTake=f(ind-1,arr,target,memo);
        
        // Mistake Not intiazed take if failes 
        boolean take =false;
        
        if(arr[ind]<=target){
            // mistake added Arr[ind]
         take=f(ind-1,arr,target-arr[ind],memo);
        }
        
        // mistake
       memo[ind][target]=notTake||take ?1:0;
          
        return notTake||take;
    }
}