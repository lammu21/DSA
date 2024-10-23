class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
          return helperFunc(nums,goal)-helperFunc(nums,goal-1);

        
    }

    public int helperFunc(int [] nums,int goal){
        if(goal<0){
            return 0;
        }
        int left=0,right=0,sum=0,subarraycount=0;
        
        while(right<nums.length){
            sum+=nums[right];
            while(sum>goal){
               sum= sum-nums[left];
               left++;
            }
            subarraycount+=right-left+1;
            right++;
            
        }
        return subarraycount;
    }
}