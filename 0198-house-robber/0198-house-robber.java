class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int [] memo= new int [n];
        Arrays.fill(memo,-1);
        return robMemo(n-1,nums,memo);
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