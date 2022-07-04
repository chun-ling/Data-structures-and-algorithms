package 何时买入股票;

/**
 * @author YUChangcan
 * @date 2022/7/3 - 11:38
 */
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null||prices.length < 2){
            return 0;
        }
        int index = 0;
        int total = 0;
        while(index < prices.length){
            while(index < prices.length - 1&&prices[index] >= prices[index + 1]){//当index为length-1时，第一个条件已经不符合了，所以即使第二条件中数组越界也不判断了
                index++;
            }
            int min = prices[index];//股票价格开始上升的第一天时股票的价格
            while(index < prices.length - 1&&prices[index] <= prices[index + 1]){//index那一天是这个周期中价格最高的一天
                index++;
            }
            total = total + prices[index++] - min;//用股票最高那一天的价格减去min，随后index++
        }

        return total;

    }
}
