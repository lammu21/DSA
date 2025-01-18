class Solution {
    public boolean canPartition(int[] nums) {
    
        int TotalSum=0;

        int n=nums.length;
        for(int i=0;i<n;i++){
              TotalSum+=nums[i];
        }
        if(TotalSum%2==1) return false;
        else{
            int k =TotalSum/2;
        int [][] memo = new int [n][k+1];
        for(int row[]:memo){
            Arrays.fill(row,-1);
        }
        return f(n-1,nums,k,memo);
        }
    }

    public boolean f(int index,int [] arr,int target,int [][] memo){
        if(target==0) return true;
        if(index==0) return arr[0]==target;
        if(memo[index][target]!=-1){
            return memo[index][target]==0?false:true;

        }
        boolean notTaken=f(index-1,arr,target,memo);
        boolean taken =false;
        if(arr[index]<=target){
            taken=f(index-1,arr,target-arr[index],memo);
        }
        memo[index][target]=notTaken||taken?1:0;
        return notTaken||taken;
    }
}