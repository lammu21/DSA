class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int n = nums.length;
        int start = 1;
        int max = Integer.MIN_VALUE;
        n = nums.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        int end = max;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = sumOfDivisorByMid(nums, mid);

            if (sum <= threshold) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;

    }

    // Function to find sum of all remider values when divided by mid
    public static int sumOfDivisorByMid(int[] nums, int mid) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) (nums[i]) / (double) (mid));
        }

        return sum;
    }
}