class Solution {
    public int maxProfit(int[] prices) {
      //    
    int max=0;
        int min_price=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min_price=Math.min(min_price, prices[i]);
            max=Math.max(max, prices[i]-min_price);
        }
         return max;
            }
        
    }
// }