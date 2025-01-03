//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
  
        //code here
    public int minimumEnergy(int arr[],int N){
        //code here
        int [] memo= new int [N+1];
        Arrays.fill(memo,-1);
        // Arrays.fill(dp,-1);
        return minimumEnergyhelper(arr,N-1,memo);
    }
    public static int minimumEnergyhelper(int[] arr, int N,int[] memo){
        if(N==0){
            return 0;
        }
        if(memo[N]!=-1){
            return memo[N];
        }
        
        int singlejump=minimumEnergyhelper(arr,N-1,memo)+Math.abs(arr[N]-arr[N-1]);
        
        int doublejump=Integer.MAX_VALUE;
        if(N>1){
             doublejump=minimumEnergyhelper(arr,N-2,memo)+ Math.abs(arr[N]-arr[N-2]);
        }
        return memo[N]= Math.min(singlejump,doublejump);
        
    }
    }
