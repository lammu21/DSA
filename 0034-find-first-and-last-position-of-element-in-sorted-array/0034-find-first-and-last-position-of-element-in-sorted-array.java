class Solution {
// Regular binary search modified to search first occurence
// Read comments to  understand changes 
public int first(int[] nums, int target) {
        int len=nums.length;
        int start=0;
        int end=len-1;
// variable to keep track of First position of Element in Sorted array 
        int first=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
// If the element is = target we save in First variable and, we discard second or right half search of array ,i.e we are looking for first occurence that will be in left present as it is a sorted 
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

// Regular binary search modified to search Last occurence
// Read comments to  understand changes 

    public int last(int[] nums, int target) {
        int len=nums.length;
        int start=0;
        int end=len-1;
// variable to keep track of Last position of Element in Sorted array 
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;

// If the element is = target we save in last variable and , we discard first or left half ,i.e we are looking for last occurence that will be in present right half  as it is a sorted 
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

// Leetcode function which calls first and second position's binary search

    public int[] searchRange(int[] nums, int target) {

        int first=first(nums,target);
// if we dont find occurrence of number, i.e., array does've that number we can directly {-1,-1}
        if(first==-1){
             int [] result={-1,-1};
            return result;
        }
        int last=last(nums,target);
        int [] result={first,last};

        return result;
    }
}