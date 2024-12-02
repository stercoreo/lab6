/**
 * Main class for demonstrating the Strategy pattern with dynamic sorting.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        // Create context with initial array
        ArraySorter sorter = new ArraySorter(numbers);

        // Print initial state
        sorter.printArray();

        // Sort in ascending order
        sorter.setSortStrategy(new AscendingSort());
        sorter.sort();

        // Sort in descending order
        sorter.setSortStrategy(new DescendingSort());
        sorter.sort();
    }
}
