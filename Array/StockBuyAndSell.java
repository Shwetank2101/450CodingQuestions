import java.util.Scanner;

public class StockBuyAndSell {

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int count = 0;
        for(int i = 1;i<n;i++){
            count = Math.max(0,count+prices[i]-prices[i-1]);
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
}
