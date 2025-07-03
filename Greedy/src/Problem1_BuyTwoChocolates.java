import java.util.Scanner;
import java.util.*;

public class Problem1_BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = sc.nextInt();
        }
            Arrays.sort(chocolates);
            int cost = chocolates[0] + chocolates[1];
            if(cost<=money){
                System.out.println(money - cost);
            }else{
                System.out.println(money);
            }
    }
}
