//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends





class Solution {
    
    // Previous problem we find first and last occurence of given number 
    // Here in this prblem we are reusing the code in order to count the number occurences
    
    int count(int[] arr, int n, int x) {
        // code here
        int first=first(arr,x);
        if(first==-1){
            //  int [] result={-1,-1};
            return 0;
        }
        int last=last(arr,x);
// only difference is here in unlike previous problem we're not
// returning array of first and last occurence

// we're return last occurrence -first occurrence +1 which in turn equals to number occurences
        
        return last-first+1;
        
    }
    
     public int first(int[] nums, int target) {
        int len=nums.length;
        int start=0;
        int end=len-1;
        int first=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return first;
    }

    public int last(int[] nums, int target) {
        int len=nums.length;
        int start=0;
        int end=len-1;
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return last;
    }
}