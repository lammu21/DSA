class Solution {
    // binary search with check condition
    public boolean isPerfectSquare(int num) {

// long being used  to tackle larger num value
        long start = 1;
        long end = num;

        while (start <= end) {

            long mid = start + (end - start) / 2;
            // if mid*mid equals to given num we'll return true
            if (mid * mid == num) {
                return true;
            }
            // check if mid*mid is less than num , we'll trim down left half, cause elements
            // square will be lesser than num
            else if (mid * mid < num) {
                start = mid + 1;
            }
            // if mid*mid is not less than or equals to num, then it will be greater than
            // num , triming right half, cause elements square will be greater than num
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}