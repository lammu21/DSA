//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        
        // int xor=0;
        // while(l<=r){
        //     xor=xor^l;
        //     l++;
        // }
        //  return xor;
         
        //  return r;
        
        // System.out.println(findXORFunction(l-1)^r);
        
        return findXORFunction(l-1)^findXORFunction(r);
        
    }
    
    public static int findXORFunction(int n){
        
        if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }
        else {
            return n;
        }
    }
         
}