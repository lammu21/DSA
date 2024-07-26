class Solution {
    public int findMin(int[] nums) {
        int start =0;
        int end=nums.length-1;

// min variable to store smallest element in array     
        int min = Integer.MAX_VALUE;

        while(start<=end){
            int mid=start+(end-start)/2;
// below if is check whether first half (start to mid ) is sorted or not 
            if(nums[start]<=nums[mid]){
// if first half sorted we pick start and compare it with min, if start is smaller we consider it as smallest until now, and we discard first half, because if first half is sorted start will be the minimum, we dont have to check for smallest in sorted first half
                min =Math.min(nums[start],min);
                start=mid+1;
            }
// else second half sorted, we pick mid and compare it with min, if mid is smaller we consider it as smallest until now, we discard second half, because there no point to check for smallest in sorted, mid will be smallest 
            else {
                min=Math.min(nums[mid],min);
                end=mid-1;
            }
        }
        return min;
    }
}