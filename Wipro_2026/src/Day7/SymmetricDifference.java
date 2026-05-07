package Day7;

import java.util.*;

public class SymmetricDifference {

    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        union.removeAll(intersection);
        return union;
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("Symmetric Difference: " + findSymmetricDifference(setA, setB));
    }
}
