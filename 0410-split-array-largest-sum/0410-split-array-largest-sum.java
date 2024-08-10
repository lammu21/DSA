class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        // if(k>n){
        //     return -1;
        // }
        int start=Integer.MIN_VALUE;
        int end=0;
        
        for(int i=0;i<n;i++){
            if(start<nums[i]){
                start=nums[i];
               
            }
             end+=nums[i];
        }
        // System.out.println(end);

        if(k==1){
            return end;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
             int numOfSubarrays=findNumOfSubarrays(nums,mid);
             
             if(numOfSubarrays<=k){
                end=mid-1;
             }
             else{
                start=mid+1;
             }

        }
        return start;
    }
    public static int findNumOfSubarrays(int [] nums, int sumLimit){
        int numOfSubarrays=1;
        int sumOfsubarray=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(sumOfsubarray+nums[i]<=sumLimit){
                sumOfsubarray+=nums[i];
            }
            else {
                numOfSubarrays++;
                sumOfsubarray=nums[i];
            }
        }
        return numOfSubarrays;
    }
}