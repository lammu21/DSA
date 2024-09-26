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
            Solution obj = new Solution();
            obj.sieve();
            List<Integer> ans = obj.findPrimeFactors(n);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // You must implement this function
    static void sieve() {}

    static List<Integer> findPrimeFactors(int N) {
         List<Integer> primeFactors = new ArrayList<>();
        boolean[] isPrime = new boolean[N + 1];

        // Initialize all elements as prime
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // Mark multiples of prime numbers as non-prime
        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= N; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Find prime factors of N
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                primeFactors.add(i);
                N /= i;
            }
        }

        return primeFactors;
    }
  
    
}
