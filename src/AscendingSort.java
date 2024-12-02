import java.util.Arrays;

/**
 * Concrete strategy for sorting an array in ascending order.
 */
public class AscendingSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting in ascending order.");
        Arrays.sort(array);
        System.out.println("Result: " + Arrays.toString(array));
    }
}
