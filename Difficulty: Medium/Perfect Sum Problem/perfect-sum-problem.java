//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        // Loop for each test case
        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution(); // Create an object of Solution class
            System.out.println(
                ob.perfectSum(nums, target)); // Call perfectSum and print the result
            System.out.println("~");          // Call perfectSum and print the result
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to calculate the number of subsets with a given sum
    
    // me from scratch
    public int perfectSum(int[] nums, int target) {
        // code here
        int len = nums.length;
        
        int [][] dp = new int [len][target+1];
        
        // // base cases
        // if(nums[0]<=target) dp[0][nums[0]]=1;
        
        // for(int i=0;i<len;i++) 
        //   dp[i][0]=1;
        
        
        
         if(nums[0] == 0) dp[0][0] =2;  // 2 cases -pick and not pick
    
             else dp[0][0] = 1;  // 1 case - not pick
    
               if(nums[0]!=0 && nums[0]<=target) dp[0][nums[0]] = 1;
        
        
        for(int ind=1;ind<len;ind++){
            for(int tar=0;tar<=target;tar++){
                int notTaken= dp[ind-1][tar];
                
                int taken=0;
                if(nums[ind]<=tar){
                    taken=dp[ind-1][tar-nums[ind]];
                }
                dp[ind][tar]=taken+notTaken;
            }
        }
        return dp[len-1][target];
        
    }
}


