class Solution {
    public int findPeakElement(int[] nums) {

        int n=nums.length;
//  Edge case to check if array with one element 
        if(nums.length==1){
            return 0;
        } 
    // if first element greater than second element will be a peak as per question 
       if(nums[0]>nums[1]){
           return 0;
       }
    // if last element greater than second last element will be a peak as per question 
       if(nums[n-1]>nums[n-2]){
           return n-1;
       }
    //    Binary search starts 
       int start=1,end=n-2;
       while(start<=end){
        int mid =start+(end-start)/2;

//  check if mid is peak

        if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
            return mid;
        }

// if mid is not peak checking whther mid is in increasing side if it is in increasing half,
//  elimating left half

        else if(nums[mid-1]<nums[mid]){
            start=mid+1;
        }
// if mid is in decreasing side we've already crossed mid so elimating right half
        else //if(nums[mid-1]>nums[mid])
        {
            end=mid-1;
        }
      
       }
         return -1;
        
    }
}