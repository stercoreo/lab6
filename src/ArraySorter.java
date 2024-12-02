import java.util.Arrays;

/**
 * Context class for managing sorting operations with dynamic strategies.
 */
public class ArraySorter {
    private SortStrategy sortStrategy;
    private int[] array;

    public ArraySorter(int[] array) {
        this.array = array;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        if (sortStrategy == null) {
            System.out.println("No sorting strategy set!");
            return;
        }
        sortStrategy.sort(array);
    }

    public void printArray() {
        System.out.println("Current array: " + Arrays.toString(array));
    }
}
