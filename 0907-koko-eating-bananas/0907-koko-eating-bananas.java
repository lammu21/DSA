class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = max_of_piles(piles);

        while (start <= end) {
            int mid = (end + start) / 2;
            int hours_per_mid = hours_per_mid_method(piles, mid);
            if (hours_per_mid <= h) {

                // i did mistake here in code instead of end i took start
                end = mid - 1;
            }
            else //(hours_per_mid>h)
            {
               start=mid+1;
            }
        }
        return start;
    }
    public int max_of_piles(int [] piles){
        int max=Integer.MIN_VALUE;
         int n=piles.length;
        for(int i =0;i<n;i++){
            max=Math.max(max, piles[i]);
        }
        return max;
    }
    public int hours_per_mid_method(int [] piles , int mid){
        int total_hours=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            
// number of bananas per hour is equals to banana/ hours 
            double hours = Math.ceil((double)piles[i]/(double)mid);
// pile[i] number of bananas per hour(mid), adding all hours for all bananas
            total_hours+=hours;

            // total_hours += Math.ceil((double)(piles[i]) / (double)(mid));
        }
        return total_hours;
    }
}