class Solution {

    // Regular binary search 
    public int search(int[] nums, int target) {
        int len=nums.length;
        int start=0;
        int end=len-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}