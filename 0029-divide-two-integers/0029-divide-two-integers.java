class Solution {
    // public int divide(int dividend, int divisor) {

    //     if (dividend == divisor) {
    //         return 1;
    //     }

    //     // snipets to know ans signs
    //     boolean sign = true;
    //     if (dividend >= 0 && divisor < 0) {
    //         sign = false;
    //     }
    //     if (dividend < 0 && divisor >= 0) {
    //         sign = false;
    //     }

    //     long D = Math.abs((long) dividend);
    //     long d = Math.abs((long) divisor);

    //     int result = 0;
    //     while (D >= d) {

    //         int count = 0;
    //         while (D >= (d << count +1)) {
    //             count++;
    //             result = result + (1 << count);
    //             D = D - (d * (1 << count));
    //         }

    //     }

    //     if (result >= Integer.MAX_VALUE && sign == false) {
    //         return Integer.MIN_VALUE;
    //     }
    //     if (result >= Integer.MAX_VALUE && sign == true) {
    //         return Integer.MAX_VALUE;
    //     }
    //     if (sign) {
    //         return result;
    //     }
    //     return -1 * result;

    // }

    public int divide(int dividend, int divisor) {
        // Handling edge cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow case
        }
        
        // Determine the sign of the quotient
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;

        // Work with positive values to avoid overflow
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        int result = 0;

        // Subtract divisor multiplied by powers of two from dividend
        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            int multiple = 1;

            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            ldividend -= temp;
            result += multiple;
        }

        // Apply the sign
        return sign * result;
    }


    



}
