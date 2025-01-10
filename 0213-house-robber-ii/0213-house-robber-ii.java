class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int [] nums1=new int[n];
        int [] nums2=new int[n];
        
        for(int i=0;i<n;i++){
            if(i!=0) nums1[i]=nums[i];
             if(i!=n-1) nums2[i]=nums[i];
        }
        int ans1= robSpace(n,nums1);
        int ans2= robSpace(n,nums2);
          
        return Math.max(ans1,ans2);
        
    }
     static int robSpace(int n,int []nums){
      int prev=nums[0];
      int prev2=0;
      for(int i =0;i<n;i++){
        int pick =nums[i];

        if(i>1){
            pick+=prev2;

        }
        int nonPick=prev;
        int current=Math.max(pick,nonPick);
        prev2=prev;
        prev=current;
      }
      return prev;
   }
}