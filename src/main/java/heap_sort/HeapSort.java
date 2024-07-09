package heap_sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/*
* sort ascending order (alphabetical order)
* */
public class HeapSort {
    public static void main(String[] args) {
        List<String> fruitsNames = new ArrayList<>();
        fruitsNames.add("banana");
        fruitsNames.add("apple");
        fruitsNames.add("mango");
        fruitsNames.add("pineapple");
        fruitsNames.add("orange");

        System.out.println("unsorted list");
        System.out.println(fruitsNames);
        sort(fruitsNames);
        System.out.println("sorted list");
        printSortedList(fruitsNames);

    }

    private static void sort(List<String> fruits) {
        int N = fruits.size();

        for (int i = (N / 2) - 1; i >= 0; i--) {
            heapify(fruits, N, i);
        }

        for (int i = N - 1; i >= 0; i--) {
            String temp = fruits.get(0);
            fruits.set(0, fruits.get(i));
            fruits.set(i, temp);
            heapify(fruits, i, 0);
        }
    }

    public static void heapify(List<String> fruits, int n, int i) {
        int largest = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        if (leftIndex < n && fruits.get(leftIndex).compareTo(fruits.get(largest)) > 0) {
            largest = leftIndex;
        }

        if (rightIndex < n && fruits.get(leftIndex).compareTo(fruits.get(largest)) > 0) {
            largest = rightIndex;
        }

        if (largest != i) {
            String temp = fruits.get(i);
            fruits.set(i, fruits.get(largest));
            fruits.set(largest, temp);
            heapify(fruits, n, largest);
        }
    }

    private static void printSortedList(List<String> fruits) {
        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
    }
}
