import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            activities[i][0] = scanner.nextInt();
            activities[i][1] = scanner.nextInt();
        }

        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int lastEnd = activities[0][1];

        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEnd) {
                count++;
                lastEnd = activities[i][1];
            }
        }

        System.out.println(count);
        scanner.close();
    }
}