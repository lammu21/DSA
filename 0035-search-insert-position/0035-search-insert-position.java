class Solution {

// Upper bound modification 
// Check comments to understand difference 
    public int searchInsert(int[] nums, int target) {
         int len=nums.length;
        int start=0;
        int end=len-1;

// to store the return value 

        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
//   if target is equal, we just return mid 
            if(nums[mid]==target){
              return mid;
        }
// if target is greater than mid value, we save mid if number doesn't we need return floor(before) of the number 
            else if (nums[mid]<target){
                 result=mid;
                 start=mid+1;
            }

            else{
                end=mid-1;
            }
            
        }
// returning floor +1 index, so position will be insert of target in array 
         return result+1;
    
    }
}