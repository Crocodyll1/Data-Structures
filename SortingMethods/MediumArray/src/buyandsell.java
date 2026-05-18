import java.util.*;


public class buyandsell {
    public static int maxProfit(int[] prices) {
        int minprice  = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            else if(prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];

        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
    }
}

/*

TC - O(n)
SC - O(1)

steps :
Initialize minimum buying price and maximum profit.
Traverse the stock prices array one by one.
Check if current price is smaller than minimum price.
If not, calculate current profit using current price and minimum price.
Update maximum profit if current profit is greater.



 */