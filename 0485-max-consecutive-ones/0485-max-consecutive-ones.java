class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int n=nums.length;

        for(int i=0; i<n ;i++){
            int count=0;

            while(i<n && nums[i]==1){
                count++;
                i++;
            }

            max=(count>max) ? count : max;


        }
        return max;
        
    }
}