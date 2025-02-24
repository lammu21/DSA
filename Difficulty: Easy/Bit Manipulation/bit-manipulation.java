//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        
        System.out.print(((num>>i-1)&1) //acutally to get bit, it should be (num>>1) &1 but here instex starts from 1 i.e., -1
                         +" "+((num|(1<<i-1))) //to set bit, it should be num|(1<<i) but here instex starts from 1 i.e., -1
                         +" "+((num&~(1<<i-1))));//to clear bit, it should be num&~(1<<i) but here instex starts from 1 i.e., -1
        //clear bit is confusing 
        
    }
}
