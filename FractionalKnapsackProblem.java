import java.util.*;

class Item {
    int value, weight;
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsackProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();         // Number of items
        int capacity = scanner.nextInt();  // Knapsack capacity

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int weight = scanner.nextInt();
            items[i] = new Item(value, weight);
        }

        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) ->
                Double.compare((double)b.value / b.weight, (double)a.value / a.weight));

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.value * ((double)capacity / item.weight);
                break;
            }
        }

        System.out.printf("Maximum value: %.2f\n", totalValue);
    }
}
