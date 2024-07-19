//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int start=0;
        int end=arr.size()-1;
        // System.out.println(end);
        // return end;
        int min =Integer.MAX_VALUE;
        int index=-1;
        
        while(start<=end){
            
              // If the array is already sorted (not rotated at all)
            if (arr.get(start) <= arr.get(end)) {
                if (arr.get(start) < min) {
                    min = arr.get(start);
                    index = start;
                }
                break;
            }
          int mid = start + (end - start) / 2;
            
            if(arr.get(start)<=arr.get(mid)){
                if(arr.get(start)<min){
                   min=arr.get(start);
                   index=start;
                }
                 start=mid+1;
            }
            else {
                if(arr.get(mid)<min){
                   min=arr.get(mid);
                   index=mid;
                }
                end=mid-1;
            }
        
            
        }
        return index;
    }
}