import java.util.Arrays;
public class problem4_coinChange {
    public int problem4_coinChange(int[] coins, int amount) {
        int[] dp =new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;
        for(int e: coins){
            for(int i=1; i<=amount; i++){
                if(e<=i){
                    dp[i]=Math.min(dp[i],dp[i-e]+1);
                }
            }
        }
        return dp[amount]>amount?-1 : dp[amount];
    }
    public static void main(String[] args) {
        problem4_coinChange obj = new problem4_coinChange();
        System.out.println(obj.problem4_coinChange(new int[]{1,2,5},11));

    }
}
