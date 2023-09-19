class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            //found new low
            if (prices[right] < prices[left]) {
                left = right;
                right++;
                continue;
            }
            //found profit
            if (prices[right] > prices[left]) {
                //calculate profit
                if ((prices[right] - prices[left]) > max) {
                    max = prices[right] - prices[left];
                }
            }
            right++;
        }

        return max;
    }
}
