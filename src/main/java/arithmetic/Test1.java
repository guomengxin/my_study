package arithmetic;

public class Test1 {
    public static void main(String[] args) {
        int[] prices = {1, 4, 2};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        // write code here
        if (null == prices || prices.length == 0) {
            return 0;
        }
        int profit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}
