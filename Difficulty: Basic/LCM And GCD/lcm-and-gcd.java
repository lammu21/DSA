//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long a=A,b=B;
        // ArrayList<Long> result= new ArrayList<>();
        Long [] result = new Long [2];
        // ArrayList<Long> x = new ArrayList<Long>(Arrays.asList(1,2));
        
        // ArrayList<String> elements = new ArrayList<String>();
        Long GCD=0L;
        
        
        while(A>0&&B>0){
            if(A>B){
                A=A%B;
            }
            else {
        B=B%A;
        }
            if(A==0){
                GCD=B;
            }
            else{
                GCD=A;
                
            }
        }
        Long LCM= (a*b)/GCD;
        
        result[0]=LCM;
        result[1]=GCD;
        
        return result;
        
    }
};