class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // why we take max of array start , i.e.,we want make sure that we can carry any
        // weight in within a day, if we take of max of array, we can carry all other
        // weights in within a day
        int start = Integer.MIN_VALUE;
        // why we take summation of array as end i.e., summation is enough to carry ship
        // all in a day, more summation can also do to optimize the we take summation
        int end = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int daysReqToMid = calculateDaysReqToMid(weights, mid);
            if (daysReqToMid <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public int calculateDaysReqToMid(int[] weights, int capacity){
        int days=1; //first day
        int load=0;
          for (int i = 0; i < weights.length; i++) {
            if(load+weights[i]>capacity){// if load is greater than capacity 
                days++;// load will be carry on another day 
                load=weights[i];// load will be reset to zero and add up with weight[i],
                
            }
            else{
                // else load is doesn't exceed  capacity load is add up with weight[i]
                load+=weights[i];
            }
          }
          return days;
    }
}

//  most optimal code on leetcode
// class Solution {
//     // its not my solution
//     public static boolean findDays(int[] a, int m, int d) {

//         int cnt = 1, sum = 0;
//         for (int w : a) {
//             if (w > m)
//                 return false;
//             if ((sum += w) > m) {
//                 if (++cnt > d)
//                     return false;
//                 sum = w;
//             }
//         }
//         return true;
//     }

//     public int shipWithinDays(int[] weights, int days) {

//         if (weights.length == 5 && weights[0] == 500 && weights[weights.length - 1] == 500) {
//             return 1000;
//         }
//         int l = 0, r = 500 * weights.length / days;
//         while (l < r) {
//             int m = l + (r - l) / 2;
//             if (findDays(weights, m, days))
//                 r = m;
//             else
//                 l = m + 1;
//         }
//         return l;
//     }
// }