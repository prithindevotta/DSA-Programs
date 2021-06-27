package cp;


public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxprof=0;
        int minStock = Integer.MAX_VALUE;
        for (int i=0; i< prices.length; i++){
           if (prices[i]<minStock){
               minStock = prices[i];
           }
           else if (prices[i]-minStock>maxprof){
               maxprof = prices[i]-minStock;
           }
        }
        return maxprof;
    }
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,7}));
    }
}
