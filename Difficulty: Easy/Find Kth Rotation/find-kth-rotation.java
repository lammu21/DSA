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
    // finding smallest element's index, that will be your rotation point 
    public int findKRotation(List<Integer> arr) {
        // Code here
        int start=0;
        int end=arr.size()-1;
        // System.out.println(end);
        // return end;
        int min =Integer.MAX_VALUE;
        int index=-1;
        
        while(start<=end){
            
// checking if array is rotated or not 
            
        if(arr.get(start)<=arr.get(end)){
                if(arr.get(start)<min){
                   min=arr.get(start);
// updated start index as rotation point break out of method
                   index=start;
                }
                break;
        }
     
            int mid=start+(end-start)/2;
 // below if is check whether first half (start to mid ) is sorted or not
            
            if(arr.get(start)<=arr.get(mid)){
// if first half sorted we pick start and compare it with min, if start is
// smaller we consider it as smallest until now,store it's index  and we discard first half,
// because if first half is sorted start will be the minimum, we dont have to
// check for smallest in sorted first half
                if(arr.get(start)<min){
                   min=arr.get(start);
                   index=start;
                }
                 start=mid+1;
            }
 // else second half sorted, we pick mid and compare it with min, if mid is
// smaller we consider it as smallest until now,,store it's index   we discard second half, because
// there no point to check for smallest in sorted, mid will be smallest
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