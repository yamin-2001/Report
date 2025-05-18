
public class FractionalKnapsack {

    public static double getMaxValue(List<Item> items, int capacity) {
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0.0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.ratio * capacity;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        List<Item> items = new ArrayList<>();
        System.out.println("Enter value and weight of each item:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items.add(new Item(value, weight));
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        double maxValue = getMaxValue(items, capacity);
        System.out.printf("Maximum value in knapsack = %.2f\n", maxValue);
    }
}
