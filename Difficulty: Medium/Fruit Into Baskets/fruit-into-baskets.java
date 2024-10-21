//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to array
            Integer[] arr = new Integer[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call totalFruits method and print result
            Integer ans = ob.totalFruits(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int totalFruits(Integer[] arr) {
        // code here
         // Map to store the count of each type of fruit in the current window
        HashMap<Integer, Integer> basket = new HashMap<>();
        int left = 0;  // Start of the sliding window
        int maxFruits = 0;

        // Iterate through the array, treating 'right' as the end of the window
        for (int right = 0; right < arr.length; right++) {
            // Add the current fruit to the basket
            basket.put(arr[right], basket.getOrDefault(arr[right], 0) + 1);

            // Shrink the window if we have more than 2 types of fruits
            while (basket.size() > 2) {
                basket.put(arr[left], basket.get(arr[left]) - 1);

                // Remove fruit type from the basket if its count becomes 0
                if (basket.get(arr[left]) == 0) {
                    basket.remove(arr[left]);
                }
                left++;  // Move the window's start point to the right
            }

            // Calculate the maximum number of fruits picked so far
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
    }
