class Solution {
    public int singleNumber(int[] nums) {

        int xor = 0;
        for(int i=0;i<nums.length;i++){

            // 0 xor of any number is that number
            // i.e., 0^4=4 
            // and number xor of same number is 0
            // i.e.,4^4
            xor=xor^nums[i];
        }
        return xor;
    }
}