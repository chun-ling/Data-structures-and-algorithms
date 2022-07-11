package 买卖股票的最佳时机;

/**
 * @author YUChangcan
 * @date 2022/7/11 - 9:24
 */
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;
        int index = 0;
        int total = 0;
        int min = Integer.MAX_VALUE;
        while(index < prices.length) {
            while (index < prices.length - 1 && prices[index] >= prices[index + 1])
                index++;
            if(prices[index] < min)
                min = prices[index];
            while (index < prices.length - 1 && prices[index] <= prices[index + 1])
                index++;
            if (prices[index] - min > total) {
                total = prices[index] - min;
            }
            index++;
        }
        return total;
    }

}
