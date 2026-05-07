package Day10;

import java.util.LinkedList;

public class AddLinkedLists {

    // Method to add two LinkedLists element-wise
    public static LinkedList<Integer> addLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        int size = Math.max(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            int val1 = (i < list1.size()) ? list1.get(i) : 0;
            int val2 = (i < list2.size()) ? list2.get(i) : 0;
            result.add(val1 + val2);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Example data
        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(5);
        list2.add(15);
        list2.add(25);
        list2.add(35); // extra element

        LinkedList<Integer> sumList = addLists(list1, list2);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Sum List: " + sumList);
    }
}
