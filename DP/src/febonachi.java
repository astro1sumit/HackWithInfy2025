import java.util.Scanner;

public class febonachi {
    public static int febonachi(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return febonachi(n - 1) + febonachi(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(febonachi(n));
    }
}