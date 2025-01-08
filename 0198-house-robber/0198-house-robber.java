class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int [] memo= new int [n];
        Arrays.fill(memo,-1);
        // return robMemo(n-1,nums,memo);
        int [] tab= new int [n];
        return robTab(n,nums,tab);
    }
    static int robTab(int n,int []nums,int[] dp){
        dp[0]=nums[0];
        // int negative =0;
        for(int i =1;i<n;i++){
            int pick=nums[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notPick=dp[i-1];

            dp[i]=Math.max(pick,notPick);
        }
        return dp[n-1];
            
        }
    
    static int robMemo(int n,int []nums,int [] memo){
        if(n==0){
            return nums[0];
        }
        if(n<0){
            return 0;
        }
        if(memo[n]!=-1){
            return memo[n];
        }

        int pick=nums[n]+robMemo(n-2,nums,memo);
        int notPick=0+robMemo(n-1,nums,memo);

        return memo[n]=Math.max(pick,notPick);
    }
}