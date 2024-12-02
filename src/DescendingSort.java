import java.util.Arrays;
import java.util.Collections;

/**
 * Concrete strategy for sorting an array in descending order.
 */
public class DescendingSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting in descending order.");
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            array[i] = boxedArray[i];
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
