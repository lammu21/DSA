class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // int sum=0;
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //      sum=sum+nums[i];
        // } 
        // if(sum<threshold){
        //     return 1;
        // }
         
         int start=1;
         int max=Integer.MIN_VALUE;
          n=nums.length;
         for(int i =0;i<n;i++){
            max=Math.max(max, nums[i]);
        }
        
       
         int end = max;
         while(start<=end){
            int mid= start+(end-start)/2;
            sumOfDivisorByMid(nums,mid);
           
            if(sumOfDivisorByMid(nums,mid)<=threshold){
               end=mid-1;
            }
            else {
                start=mid+1;
            }
         }
         return start;
        
    }
    public static int sumOfDivisorByMid(int[]nums, int mid){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           sum += Math.ceil((double)(nums[i]) / (double)(mid));
            }
        
        return sum;
    }
}