//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

//User function Template for Java

class Solution
{     
    //  next day revision done 
    
    // we know the range, in which answer lies that's why using binary search
    public int NthRoot(int n, int m)
    {
        // code here
        int start=1;
        int end=m;
        
        while(start<=end){
            int mid = start +(end-start)/2;
            int Nth_mid= find_nth_mid(mid,m,n);
            /*function which return 
              0, means mid^n < m
              1, means mid^n==m
              2, means mid^n>m*/
            if(Nth_mid==1){
                return mid;
            }
            else if(Nth_mid==0){
                start = mid+1;
            }
            else {
                end=mid-1;
            }
            
            }
            return -1;
        
    }
    public int find_nth_mid(int mid, int m,int n){
        long ans=1;
        // ans is to store mid^n value 
        for(int i=1;i<=n;i++){
            ans=ans*mid;
             if (ans>m){
              return 2;
             }
                
            // else if(ans==m){
            //   return 1;
            // }
            
        }
         if(ans==m){
              return 1;
         }    
             
        return 0;
        }
       
        

}