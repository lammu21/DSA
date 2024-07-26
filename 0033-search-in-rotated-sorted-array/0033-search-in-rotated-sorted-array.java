class Solution {

    // Binary Search modification
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if mid is equals to target we'll return mid

            if (nums[mid] == target) {
                return mid;
            }
            // below if is to check whether first half ( start to mid ) is sorted array or
            // not

            if (nums[start] <= nums[mid]) {

                // below if is to check target in the range of start and mid, if yes discard
                // second half i.e.,after mid

                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                }
                // below else is to checkk if doesn't exist in first half, discard first half
                // before mid
                else {
                    start = mid + 1;
                }
            }
            // below else is to if first half is not sorted second part must be sorted for
            // an rotated sorted array

            else {
                // below if is to check target in the range of mid and end, if yes discard first
                // half i.e.,before mid

                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                }
                // below else is to check if doesn't exist in second half, discard second half
                // after mid.
                else {
                    end = mid - 1;
                }

            }
        }
        return -1;

    }
}