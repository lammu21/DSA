//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int original_number=n;
        int armstrongNumber=0;
        while(n>0){
            int last_digit=n%10;
            
            armstrongNumber+=(last_digit*last_digit*last_digit);
            
            n/=10;
            
        }
        if(original_number==armstrongNumber){
            return "true";
        }
        
            return "false";
    
    }
}