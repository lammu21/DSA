class Solution {

    // revise again comment are not clear
    public int singleNonDuplicate(int[] nums) {
//  Edge case to check if array with one element 
        if(nums.length==1){
            return nums[0];
        }
// Check if first element is single element
        if(nums[0]!=nums[1]){
            return nums[0];
        }

// Check if Last element is single element 
        if(nums[(nums.length)-1]!=nums[(nums.length)-2]){
            return nums[(nums.length)-1];
        }

// Binary Search implementation starts here 

int start =1,end=nums.length-2;

      while(start<=end){
        int mid = start+(end-start)/2;

// check for mid element if it is single 

        if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
             return nums[mid];
        }
// triming the search space by half 
/*  identifing first half means until single element  (two cases)
  if mid is even -> mid+1 should equals to mid 
  if mid is odd -> mid-1 should equals to mid */

       if(mid%2==0&&nums[mid]==nums[mid+1]||mid%2!=0&&nums[mid]==nums[mid-1]){
          start=mid+1;
       }
       else {
            end=mid-1;
       }

      }
      return -1;
   }
}