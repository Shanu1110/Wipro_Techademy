package Day3;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Ascending
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        // Descending
        int[] desc = arr.clone();
        for (int i = 0; i < desc.length / 2; i++) {
            int temp = desc[i];
            desc[i] = desc[desc.length - 1 - i];
            desc[desc.length - 1 - i] = temp;
        }
        System.out.println("Descending: " + Arrays.toString(desc));
    }
}
