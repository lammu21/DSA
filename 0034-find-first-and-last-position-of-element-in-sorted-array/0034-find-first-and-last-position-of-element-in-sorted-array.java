class Solution {

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

    public int[] searchRange(int[] nums, int target) {

        int first=first(nums,target);
        if(first==-1){
             int [] result={-1,-1};
            return result;
        }
        int last=last(nums,target);
        int [] result={first,last};

        return result;
    }
}