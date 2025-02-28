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
    
     int countPartitions(int[] arr, int d) {
        // code here
        int totSum=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            
            totSum+=arr[i];
            
        }
        
        if((totSum-d)%2!=0 ||totSum<d){
            return 0;
        }
        
        int target= (totSum-d)/2;
        
        if(target<0){
            return 0;
        }
        
        int [][] dp= new int [n][target+1];
        
        // if(arr[0]==0&&target==0)
        //     dp[0][0]= 2;
       
            dp[0][0]= 1;
        
        if(arr[0]<=target){
            dp[0][arr[0]]+=1;
            
            
        }
        
        for(int ind=1;ind<n;ind++){
            for(int tar=0;tar<=target;tar++){
                int notTaken=dp[ind-1][tar];
                
                int taken=0;
                if(arr[ind]<=tar){
                    taken =dp[ind-1][tar-arr[ind]];
                }
                dp[ind][tar]=taken+notTaken;
            }
        }
        
        
        return dp[n-1][target];
     }
}
    
    
    
    
// int countPartitions(int[] arr, int d) {
//         // code here
//         int totSum=0;
//         int n=arr.length;
        
//         for(int i=0;i<n;i++){
            
//             totSum+=arr[i];
            
//         }
        
//         if((totSum-d)%2!=0 ||totSum<d){
//             return 0;
//         }
        
//         int target= (totSum-d)/2;
        
//         if(target<0){
//             return 0;
//         }
        
//         int [][] dp= new int [n][target+1];
        
//         for(int [] row :dp){
//             Arrays.fill(row,-1);
//         }
        
//         return func(n-1,target,arr,dp);
// }







//  int func(int ind,int target,int [] arr,int [][]dp){
     
//      if(ind==0){
//          if(target==0&& arr[0]==0) return 2;
         
//          if(target==0||arr[0]==target) return 1;
         
//          return 0;
         
//      }
     
     
//      if(dp[ind][target]!=-1){
//          return dp[ind][target];
//      }
     
//      int notTaken= func(ind-1,target,arr,dp);
     
//      int taken=0;
//      if(arr[ind]<=target){
//          taken=func(ind-1,target-arr[ind],arr,dp);
//      }
     
//      return dp[ind][target]=taken+notTaken;
     
//  }

// }
