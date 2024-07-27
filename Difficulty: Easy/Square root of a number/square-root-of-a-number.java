//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long start =1;
		long end=x;
		long ans=1;
		
// 		Binary search with check condition 

         while(start<=end){
             
             long mid = start+(end-start)/2;
            //  checking if mid*mid less than or equals to given number x, if less than x we'll trim left, because left half number square values will be less than X,
            //  if(mid*mid<=x){
            //      start=mid+1;
            //  }
             //  checking if mid*mid less than or equals to given number x, if less than x we'll trim left, because left half number square values will be less than X,
            //  and we will save that mid in ans before moving further 
             if(mid*mid<=x){
                 ans=mid;
                 start=mid+1;
             }
             
             else{
                 end=mid-1;
             }
             
         }
         return ans;
	 }
}
