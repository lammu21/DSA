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

        if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
            return mid;
        }
        else if(nums[mid-1]<nums[mid]){
            start=mid+1;
        }
        else {
            end=mid-1;
        }
      
       }
         return -1;
        
    }
}