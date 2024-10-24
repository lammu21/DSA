class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);

    }

    public int helper(int[] nums, int k) {
        int l = 0, r = 0, oddcount = 0, subarraycount = 0;
        while (r < nums.length) {
            if (nums[r] % 2 == 1) {
                oddcount++;
            }
            while (oddcount > k) {
                if (nums[l] % 2 == 1) {
                    oddcount--;
                }
                l++;

            }

            subarraycount += r - l + 1;
            r++;
        }
        return subarraycount;
    }

}