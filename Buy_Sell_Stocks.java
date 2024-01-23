package Arrays;

import java.util.Scanner;

public class Buy_Sell_Stocks {
    public static int buy_And_Sell_Stocks(int n[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<n.length;i++){
            if (buyPrice<n[i]){
                int profit=n[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else {
                buyPrice=n[i];
            }
        }
        System.out.println("Maximum profit till today's date is:"+maxProfit);
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        buy_And_Sell_Stocks(n);
    }
}
